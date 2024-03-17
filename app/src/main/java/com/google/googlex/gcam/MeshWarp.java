package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MeshWarp {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public MeshWarp() {
        this(GcamModuleJNI.new_MeshWarp(), true);
    }

    public static long getCPtr(MeshWarp meshWarp) {
        if (meshWarp == null) {
            return 0L;
        }
        return meshWarp.swigCPtr;
    }

    public MeshWarp(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.MeshWarp_Check(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, int i) {
        return GcamModuleJNI.MeshWarp_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), i);
    }

    public boolean Equals(MeshWarp meshWarp) {
        return GcamModuleJNI.MeshWarp_Equals(this.swigCPtr, this, getCPtr(meshWarp), meshWarp);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.MeshWarp_SerializeToString(this.swigCPtr, this, str, i);
    }

    public MeshTranslation TranslationHint() {
        return new MeshTranslation(GcamModuleJNI.MeshWarp_TranslationHint(this.swigCPtr, this), true);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_MeshWarp(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getGrid_cols() {
        return GcamModuleJNI.MeshWarp_grid_cols_get(this.swigCPtr, this);
    }

    public int getGrid_rows() {
        return GcamModuleJNI.MeshWarp_grid_rows_get(this.swigCPtr, this);
    }

    public PixelRect getMesh_warp_crop_region() {
        long MeshWarp_mesh_warp_crop_region_get = GcamModuleJNI.MeshWarp_mesh_warp_crop_region_get(this.swigCPtr, this);
        if (MeshWarp_mesh_warp_crop_region_get != 0) {
            return new PixelRect(MeshWarp_mesh_warp_crop_region_get, false);
        }
        return null;
    }

    public FloatVector getMesh_warp_data() {
        long MeshWarp_mesh_warp_data_get = GcamModuleJNI.MeshWarp_mesh_warp_data_get(this.swigCPtr, this);
        if (MeshWarp_mesh_warp_data_get != 0) {
            return new FloatVector(MeshWarp_mesh_warp_data_get, false);
        }
        return null;
    }

    public PixelRect getMesh_warp_dst_region() {
        long MeshWarp_mesh_warp_dst_region_get = GcamModuleJNI.MeshWarp_mesh_warp_dst_region_get(this.swigCPtr, this);
        if (MeshWarp_mesh_warp_dst_region_get != 0) {
            return new PixelRect(MeshWarp_mesh_warp_dst_region_get, false);
        }
        return null;
    }

    public void setGrid_cols(int i) {
        GcamModuleJNI.MeshWarp_grid_cols_set(this.swigCPtr, this, i);
    }

    public void setGrid_rows(int i) {
        GcamModuleJNI.MeshWarp_grid_rows_set(this.swigCPtr, this, i);
    }

    public void setMesh_warp_crop_region(PixelRect pixelRect) {
        GcamModuleJNI.MeshWarp_mesh_warp_crop_region_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public void setMesh_warp_data(FloatVector floatVector) {
        GcamModuleJNI.MeshWarp_mesh_warp_data_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setMesh_warp_dst_region(PixelRect pixelRect) {
        GcamModuleJNI.MeshWarp_mesh_warp_dst_region_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }
}
