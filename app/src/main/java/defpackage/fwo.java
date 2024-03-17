package defpackage;

import android.hardware.camera2.CaptureResult;
import android.location.Location;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ClientExifMetadata;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.hdrplus.MetadataConverter;

/* compiled from: PG */
/* renamed from: fwo  reason: default package */
/* loaded from: classes.dex */
public final class fwo {
    private final myo a;
    private final MetadataConverter b;
    private final dqg c;
    private final ezm d;
    private final gep e;
    private final gtb f;
    private final Gcam g;
    private final cin h;

    public fwo(Gcam gcam, cin cinVar, myo myoVar, myz myzVar, dqg dqgVar, ezm ezmVar, gep gepVar, gtb gtbVar) {
        this.c = dqgVar;
        this.d = ezmVar;
        this.a = myoVar;
        this.e = gepVar;
        this.b = new MetadataConverter(myoVar, myzVar);
        this.f = gtbVar;
        this.g = gcam;
        this.h = cinVar;
    }

    public final fzx a(ndr ndrVar, int i) {
        float f;
        int a = this.c.a((ndn) ndrVar);
        StaticMetadata GetStaticMetadata = this.g.GetStaticMetadata(a);
        ExifMetadata exifMetadata = new ExifMetadata();
        exifMetadata.setStatic_metadata(GetStaticMetadata);
        ClientExifMetadata clientExifMetadata = null;
        exifMetadata.setFrame_metadata(this.c.a(ndrVar, (GyroSampleVector) null));
        SpatialGainMap convertToSpatialGainMap = this.b.convertToSpatialGainMap(ndrVar);
        exifMetadata.setGain_map_rggb(convertToSpatialGainMap.gain_map());
        pjz d = this.d.d();
        if (d.a()) {
            Location location = (Location) d.b();
            LocationData locationData = new LocationData();
            locationData.setAltitude(location.getAltitude());
            locationData.setDegree_of_precision(location.getAccuracy());
            locationData.setLatitude(location.getLatitude());
            locationData.setLongitude(location.getLongitude());
            locationData.setTimestamp_unix(location.getTime() / 1000);
            locationData.setProcessing_method(location.getProvider());
            clientExifMetadata = new ClientExifMetadata();
            clientExifMetadata.setLocation(locationData);
        }
        if (clientExifMetadata != null) {
            exifMetadata.setClient_exif(clientExifMetadata);
        }
        Integer num = (Integer) ndrVar.a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null) {
            f = 1.0f;
        } else {
            f = this.b.getExposureCompensationStops(num.intValue());
        }
        exifMetadata.setExposure_compensation(f);
        exifMetadata.setImage_rotation(bgl.a(i, this.a));
        exifMetadata.setWb_mode(this.e.a() == geo.AUTO ? 0 : 1);
        exifMetadata.setFlash_mode(2);
        exifMetadata.setSoftware_suffix("f");
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.setExposure_compensation(f);
        aeShotParams.setUx_mode(1);
        this.b.updateAeShotParams(aeShotParams, ndrVar, 0.1225f, this.h.f(cim.a), this.f.b);
        return new fzx(exifMetadata, a, aeShotParams, convertToSpatialGainMap);
    }
}