plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.gcam.mdnssknght"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gcam.mdnssknght"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Avoid multiple (up to 14) dex splits
        multiDexEnabled = false
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(files("libs/com.google.android.camera.experimental2016.jar"))
    implementation(files("libs/com.google.android.camera.experimental2017.jar"))
    implementation(files("libs/com.google.android.camera.experimental2018.jar"))
    implementation(files("libs/com.google.android.camera.experimental2019.jar"))

    compileOnly("com.android.support.constraint:constraint-layout:2.0.4")
    compileOnly(project(":j$-stub"))
}