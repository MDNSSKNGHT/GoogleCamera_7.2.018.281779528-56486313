package defpackage;

import com.google.googlex.gcam.BoolVector;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.ShotLogData;

/* compiled from: PG */
/* renamed from: dod  reason: default package */
/* loaded from: classes.dex */
public final class dod implements far {
    public qgt a;

    public dod(ShotLogData shotLogData, int i) {
        this.a = qgt.an;
        qgr qgrVar = (qgr) qgt.an.f();
        float ae_confidence_short_exposure = shotLogData.getAe_confidence_short_exposure();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar = (qgt) qgrVar.b;
        qgtVar.a |= 2;
        qgtVar.d = ae_confidence_short_exposure;
        float ae_confidence_long_exposure = shotLogData.getAe_confidence_long_exposure();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar2 = (qgt) qgrVar.b;
        qgtVar2.a |= 4;
        qgtVar2.e = ae_confidence_long_exposure;
        float ae_confidence_single_exposure = shotLogData.getAe_confidence_single_exposure();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar3 = (qgt) qgrVar.b;
        qgtVar3.a |= 8;
        qgtVar3.f = ae_confidence_single_exposure;
        float ideal_range_compression = shotLogData.getIdeal_range_compression();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar4 = (qgt) qgrVar.b;
        qgtVar4.a |= 16;
        qgtVar4.g = ideal_range_compression;
        float actual_range_compression = shotLogData.getActual_range_compression();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar5 = (qgt) qgrVar.b;
        qgtVar5.a |= 32;
        qgtVar5.h = actual_range_compression;
        float pure_fraction_of_pixels_from_long_exposure = shotLogData.getPure_fraction_of_pixels_from_long_exposure();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar6 = (qgt) qgrVar.b;
        qgtVar6.a |= 536870912;
        qgtVar6.E = pure_fraction_of_pixels_from_long_exposure;
        float weighted_fraction_of_pixels_from_long_exposure = shotLogData.getWeighted_fraction_of_pixels_from_long_exposure();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar7 = (qgt) qgrVar.b;
        qgtVar7.a |= 1073741824;
        qgtVar7.F = weighted_fraction_of_pixels_from_long_exposure;
        float short_exp_adjustment_factor = shotLogData.getShort_exp_adjustment_factor();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar8 = (qgt) qgrVar.b;
        qgtVar8.a |= 128;
        qgtVar8.i = short_exp_adjustment_factor;
        float long_exp_adjustment_factor = shotLogData.getLong_exp_adjustment_factor();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar9 = (qgt) qgrVar.b;
        qgtVar9.a |= 256;
        qgtVar9.j = long_exp_adjustment_factor;
        float log_scene_brightness = shotLogData.getLog_scene_brightness();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar10 = (qgt) qgrVar.b;
        qgtVar10.a |= 512;
        qgtVar10.k = log_scene_brightness;
        int metering_frame_count = shotLogData.getMetering_frame_count();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar11 = (qgt) qgrVar.b;
        qgtVar11.a |= 1024;
        qgtVar11.l = metering_frame_count;
        int original_payload_frame_count = shotLogData.getOriginal_payload_frame_count();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar12 = (qgt) qgrVar.b;
        qgtVar12.a |= 2048;
        qgtVar12.m = original_payload_frame_count;
        int base_frame_index = shotLogData.getBase_frame_index();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar13 = (qgt) qgrVar.b;
        qgtVar13.a |= 4096;
        qgtVar13.n = base_frame_index;
        int merged_frame_count = shotLogData.getMerged_frame_count();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar14 = (qgt) qgrVar.b;
        qgtVar14.a |= 8192;
        qgtVar14.o = merged_frame_count;
        boolean zsl = shotLogData.getZsl();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar15 = (qgt) qgrVar.b;
        qgtVar15.a |= 262144;
        qgtVar15.s = zsl;
        float time_to_shot = shotLogData.getTime_to_shot();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar16 = (qgt) qgrVar.b;
        qgtVar16.a |= 32768;
        qgtVar16.p = time_to_shot;
        float time_to_postview = shotLogData.getTime_to_postview();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar17 = (qgt) qgrVar.b;
        qgtVar17.a |= 65536;
        qgtVar17.q = time_to_postview;
        boolean z = i == 1;
        qgtVar17.b |= 1;
        qgtVar17.H = z;
        boolean z2 = shotLogData.getExecuted_finish_on() == 1;
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar18 = (qgt) qgrVar.b;
        qgtVar18.a |= 131072;
        qgtVar18.r = z2;
        float capture_time = shotLogData.getCapture_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar19 = (qgt) qgrVar.b;
        qgtVar19.a |= 524288;
        qgtVar19.v = capture_time;
        float postview_callback_time = shotLogData.getPostview_callback_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar20 = (qgt) qgrVar.b;
        qgtVar20.a |= 1048576;
        qgtVar20.w = postview_callback_time;
        float merge_process_time = shotLogData.getMerge_process_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar21 = (qgt) qgrVar.b;
        qgtVar21.a |= 2097152;
        qgtVar21.x = merge_process_time;
        float merged_raw_callback_time = shotLogData.getMerged_raw_callback_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar22 = (qgt) qgrVar.b;
        qgtVar22.a |= 4194304;
        qgtVar22.y = merged_raw_callback_time;
        float finish_process_time = shotLogData.getFinish_process_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar23 = (qgt) qgrVar.b;
        qgtVar23.a |= 8388608;
        qgtVar23.z = finish_process_time;
        float final_image_callback_time = shotLogData.getFinal_image_callback_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar24 = (qgt) qgrVar.b;
        qgtVar24.a |= 16777216;
        qgtVar24.A = final_image_callback_time;
        float jpeg_encode_time = shotLogData.getJpeg_encode_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar25 = (qgt) qgrVar.b;
        qgtVar25.a |= 33554432;
        qgtVar25.B = jpeg_encode_time;
        float jpeg_callback_time = shotLogData.getJpeg_callback_time();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar26 = (qgt) qgrVar.b;
        qgtVar26.a |= 67108864;
        qgtVar26.C = jpeg_callback_time;
        boolean aborted = shotLogData.getAborted();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar27 = (qgt) qgrVar.b;
        qgtVar27.a |= 268435456;
        qgtVar27.D = aborted;
        float cpu_usage_factor = shotLogData.getCpu_usage_factor();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar28 = (qgt) qgrVar.b;
        qgtVar28.a |= Integer.MIN_VALUE;
        qgtVar28.G = cpu_usage_factor;
        int ux_mode = shotLogData.getUx_mode();
        int i2 = ux_mode != 1 ? ux_mode != 2 ? ux_mode != 3 ? ux_mode != 4 ? 1 : 5 : 4 : 3 : 2;
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar29 = (qgt) qgrVar.b;
        qgtVar29.I = i2 - 1;
        qgtVar29.b |= 8;
        float scene_motion_pix_per_ms = shotLogData.getScene_motion_pix_per_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar30 = (qgt) qgrVar.b;
        qgtVar30.b |= 16;
        qgtVar30.J = scene_motion_pix_per_ms;
        float scene_motion_20_sample_std_pix_per_ms = shotLogData.getScene_motion_20_sample_std_pix_per_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar31 = (qgt) qgrVar.b;
        qgtVar31.b |= 128;
        qgtVar31.L = scene_motion_20_sample_std_pix_per_ms;
        float scene_motion_10_sample_std_pix_per_ms = shotLogData.getScene_motion_10_sample_std_pix_per_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar32 = (qgt) qgrVar.b;
        qgtVar32.b |= 256;
        qgtVar32.M = scene_motion_10_sample_std_pix_per_ms;
        float percentage_valid_motion_samples_in_20_samples = shotLogData.getPercentage_valid_motion_samples_in_20_samples();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar33 = (qgt) qgrVar.b;
        qgtVar33.b |= 512;
        qgtVar33.N = percentage_valid_motion_samples_in_20_samples;
        float percentage_valid_motion_samples_in_10_samples = shotLogData.getPercentage_valid_motion_samples_in_10_samples();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar34 = (qgt) qgrVar.b;
        qgtVar34.b |= 1024;
        qgtVar34.O = percentage_valid_motion_samples_in_10_samples;
        int number_gyro_samples_used_for_metering = shotLogData.getNumber_gyro_samples_used_for_metering();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar35 = (qgt) qgrVar.b;
        qgtVar35.b |= 2048;
        qgtVar35.P = number_gyro_samples_used_for_metering;
        float std_angular_speed_rad_per_sec = shotLogData.getStd_angular_speed_rad_per_sec();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar36 = (qgt) qgrVar.b;
        qgtVar36.b |= 4096;
        qgtVar36.Q = std_angular_speed_rad_per_sec;
        float percentage_valid_gyro_samples_used_for_metering = shotLogData.getPercentage_valid_gyro_samples_used_for_metering();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar37 = (qgt) qgrVar.b;
        qgtVar37.b |= 8192;
        qgtVar37.R = percentage_valid_gyro_samples_used_for_metering;
        float max_exposure_time_ms = shotLogData.getMax_exposure_time_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar38 = (qgt) qgrVar.b;
        qgtVar38.b |= 64;
        qgtVar38.K = max_exposure_time_ms;
        float base_frame_snr = shotLogData.getBase_frame_snr();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar39 = (qgt) qgrVar.b;
        qgtVar39.b |= 16384;
        qgtVar39.S = base_frame_snr;
        int base_frame_temporal_binning_factor = shotLogData.getBase_frame_temporal_binning_factor();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar40 = (qgt) qgrVar.b;
        qgtVar40.b = 32768 | qgtVar40.b;
        qgtVar40.T = base_frame_temporal_binning_factor;
        float temporal_binning_mean_run_time_ms = shotLogData.getTemporal_binning_mean_run_time_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar41 = (qgt) qgrVar.b;
        qgtVar41.b |= 65536;
        qgtVar41.U = temporal_binning_mean_run_time_ms;
        float temporal_binning_min_run_time_ms = shotLogData.getTemporal_binning_min_run_time_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar42 = (qgt) qgrVar.b;
        qgtVar42.b |= 131072;
        qgtVar42.V = temporal_binning_min_run_time_ms;
        float temporal_binning_max_run_time_ms = shotLogData.getTemporal_binning_max_run_time_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar43 = (qgt) qgrVar.b;
        qgtVar43.b = 262144 | qgtVar43.b;
        qgtVar43.W = temporal_binning_max_run_time_ms;
        float temporal_binning_target_exposure_time_ms = shotLogData.getTemporal_binning_target_exposure_time_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar44 = (qgt) qgrVar.b;
        qgtVar44.b |= 524288;
        qgtVar44.X = temporal_binning_target_exposure_time_ms;
        float temporal_binning_target_tet_ms = shotLogData.getTemporal_binning_target_tet_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar45 = (qgt) qgrVar.b;
        qgtVar45.b |= 1048576;
        qgtVar45.Y = temporal_binning_target_tet_ms;
        float temporal_binning_mean_visual_motion_pix_per_ms = shotLogData.getTemporal_binning_mean_visual_motion_pix_per_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar46 = (qgt) qgrVar.b;
        qgtVar46.b |= 2097152;
        qgtVar46.Z = temporal_binning_mean_visual_motion_pix_per_ms;
        float temporal_binning_mean_ego_motion_pix_per_ms = shotLogData.getTemporal_binning_mean_ego_motion_pix_per_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar47 = (qgt) qgrVar.b;
        qgtVar47.b |= 4194304;
        qgtVar47.aa = temporal_binning_mean_ego_motion_pix_per_ms;
        int psaf_frame_count = shotLogData.getPsaf_frame_count();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar48 = (qgt) qgrVar.b;
        qgtVar48.b |= 8388608;
        qgtVar48.ac = psaf_frame_count;
        float preview_focus_distance_diopters = shotLogData.getPreview_focus_distance_diopters();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar49 = (qgt) qgrVar.b;
        qgtVar49.b |= 16777216;
        qgtVar49.ad = preview_focus_distance_diopters;
        float payload_focus_distance_diopters = shotLogData.getPayload_focus_distance_diopters();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar50 = (qgt) qgrVar.b;
        qgtVar50.b |= 33554432;
        qgtVar50.ae = payload_focus_distance_diopters;
        boolean sky_segmentation_used = shotLogData.getSky_segmentation_used();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar51 = (qgt) qgrVar.b;
        qgtVar51.b |= 67108864;
        qgtVar51.af = sky_segmentation_used;
        boolean sky_segmentation_failed = shotLogData.getSky_segmentation_failed();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar52 = (qgt) qgrVar.b;
        qgtVar52.c = 4 | qgtVar52.c;
        qgtVar52.am = sky_segmentation_failed;
        int sky_segmentation_total_time_ms = shotLogData.getSky_segmentation_total_time_ms();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar53 = (qgt) qgrVar.b;
        qgtVar53.b |= 134217728;
        qgtVar53.ag = sky_segmentation_total_time_ms;
        float sky_mask_ratio = shotLogData.getSky_mask_ratio();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar54 = (qgt) qgrVar.b;
        qgtVar54.b |= 268435456;
        qgtVar54.ah = sky_mask_ratio;
        float sky_darkening_strength = shotLogData.getSky_darkening_strength();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar55 = (qgt) qgrVar.b;
        qgtVar55.b |= 1073741824;
        qgtVar55.ai = sky_darkening_strength;
        float sky_denoise_strength = shotLogData.getSky_denoise_strength();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar56 = (qgt) qgrVar.b;
        qgtVar56.b |= Integer.MIN_VALUE;
        qgtVar56.aj = sky_denoise_strength;
        int hot_pixels_in_base_frame = shotLogData.getHot_pixels_in_base_frame();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar57 = (qgt) qgrVar.b;
        qgtVar57.c = 1 | qgtVar57.c;
        qgtVar57.ak = hot_pixels_in_base_frame;
        int hot_pixels_in_total = shotLogData.getHot_pixels_in_total();
        if (qgrVar.c) {
            qgrVar.b();
            qgrVar.c = false;
        }
        qgt qgtVar58 = (qgt) qgrVar.b;
        qgtVar58.c |= 2;
        qgtVar58.al = hot_pixels_in_total;
        FloatVector final_payload_frame_sharpness = shotLogData.getFinal_payload_frame_sharpness();
        for (int i3 = 0; i3 < final_payload_frame_sharpness.size(); i3++) {
            float f = final_payload_frame_sharpness.get(i3);
            if (qgrVar.c) {
                qgrVar.b();
                qgrVar.c = false;
            }
            qgt qgtVar59 = (qgt) qgrVar.b;
            if (!qgtVar59.t.a()) {
                qgtVar59.t = quw.a(qgtVar59.t);
            }
            qgtVar59.t.a(f);
        }
        BoolVector was_payload_frame_merged = shotLogData.getWas_payload_frame_merged();
        for (int i4 = 0; i4 < was_payload_frame_merged.size(); i4++) {
            boolean z3 = was_payload_frame_merged.get(i4);
            if (qgrVar.c) {
                qgrVar.b();
                qgrVar.c = false;
            }
            qgt qgtVar60 = (qgt) qgrVar.b;
            if (!qgtVar60.u.a()) {
                quy quyVar = qgtVar60.u;
                int size = quyVar.size();
                qgtVar60.u = quyVar.a(size != 0 ? size + size : 10);
            }
            qgtVar60.u.a(z3);
        }
        FloatVector payload_frame_scene_motion_pix_per_ms = shotLogData.getPayload_frame_scene_motion_pix_per_ms();
        for (int i5 = 0; i5 < payload_frame_scene_motion_pix_per_ms.size(); i5++) {
            float f2 = payload_frame_scene_motion_pix_per_ms.get(i5);
            if (qgrVar.c) {
                qgrVar.b();
                qgrVar.c = false;
            }
            qgt qgtVar61 = (qgt) qgrVar.b;
            if (!qgtVar61.ab.a()) {
                qgtVar61.ab = quw.a(qgtVar61.ab);
            }
            qgtVar61.ab.a(f2);
        }
        this.a = (qgt) qgrVar.e();
    }
}