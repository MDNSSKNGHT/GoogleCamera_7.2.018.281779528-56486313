import os
import tempfile
import pysed
import shutil

from glob import glob
from pyw import apktool, uber_apk_signer, baksmali, gradlew, git


def main():
    gradlew_cmd = gradlew.GradlewCmd()
    gradlew_cmd.task("mergeDexDebug")
    gradlew_cmd.run()

    target_apk_dir = os.environ['HOME'] + "/workspace/GoogleCamera_7.2.018.281779528-56486313"
    target_smali_files = ["kp.smali", "qc.smali"]

    with tempfile.TemporaryDirectory() as tmp:
        baksmali_cmd = baksmali.BaksmaliCmd()
        baksmali_cmd.dex("app/build/intermediates/dex/debug/mergeDexDebug/classes.dex")
        baksmali_cmd.output(tmp)
        baksmali_cmd.run()

        git_cmd = git.GitCmd()
        git_cmd.reset(hard=True, cwd=target_apk_dir)
        git_cmd.clean(recurse=True, force=True, cwd=target_apk_dir)

        for subdir, dirs, files in os.walk(target_apk_dir):
            for file in files:
                if file.endswith("smali") and file in target_smali_files:
                    target_smali = glob(tmp + "/**/" + file).pop()
                    destination_smali = glob(target_apk_dir + "/**/" + file).pop()

                    pysed.replace("defpackage/", "", target_smali)
                    shutil.copyfile(target_smali, destination_smali)

    apktool_cmd = apktool.ApktoolCmd()
    apktool_cmd.build(target_apk_dir)

    uber_apk_signer_cmd = uber_apk_signer.UberApkSignerCmd()
    uber_apk_signer_cmd.apks(target_apk_dir + "/dist")
    uber_apk_signer_cmd.overwrite(True)
    uber_apk_signer_cmd.run()


if __name__ == "__main__":
    main()
