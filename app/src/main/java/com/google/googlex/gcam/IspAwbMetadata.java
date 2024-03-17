package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IspAwbMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Statistics {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public Statistics() {
            this(GcamModuleJNI.new_IspAwbMetadata_Statistics(), true);
        }

        public static long getCPtr(Statistics statistics) {
            if (statistics == null) {
                return 0L;
            }
            return statistics.swigCPtr;
        }

        public Statistics(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_IspAwbMetadata_Statistics(j);
                }
                this.swigCPtr = 0L;
            }
        }

        protected void finalize() {
            delete();
        }

        public SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t getCount_rggb() {
            long IspAwbMetadata_Statistics_count_rggb_get = GcamModuleJNI.IspAwbMetadata_Statistics_count_rggb_get(this.swigCPtr, this);
            if (IspAwbMetadata_Statistics_count_rggb_get != 0) {
                return new SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t(IspAwbMetadata_Statistics_count_rggb_get, false);
            }
            return null;
        }

        public SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t getCount_sat_rggb() {
            long IspAwbMetadata_Statistics_count_sat_rggb_get = GcamModuleJNI.IspAwbMetadata_Statistics_count_sat_rggb_get(this.swigCPtr, this);
            if (IspAwbMetadata_Statistics_count_sat_rggb_get != 0) {
                return new SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t(IspAwbMetadata_Statistics_count_sat_rggb_get, false);
            }
            return null;
        }

        public SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t getSum_rggb() {
            long IspAwbMetadata_Statistics_sum_rggb_get = GcamModuleJNI.IspAwbMetadata_Statistics_sum_rggb_get(this.swigCPtr, this);
            if (IspAwbMetadata_Statistics_sum_rggb_get != 0) {
                return new SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t(IspAwbMetadata_Statistics_sum_rggb_get, false);
            }
            return null;
        }

        public SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t getSum_sat_rggb() {
            long IspAwbMetadata_Statistics_sum_sat_rggb_get = GcamModuleJNI.IspAwbMetadata_Statistics_sum_sat_rggb_get(this.swigCPtr, this);
            if (IspAwbMetadata_Statistics_sum_sat_rggb_get != 0) {
                return new SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t(IspAwbMetadata_Statistics_sum_sat_rggb_get, false);
            }
            return null;
        }

        public void setCount_rggb(SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t) {
            GcamModuleJNI.IspAwbMetadata_Statistics_count_rggb_set(this.swigCPtr, this, SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t));
        }

        public void setCount_sat_rggb(SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t) {
            GcamModuleJNI.IspAwbMetadata_Statistics_count_sat_rggb_set(this.swigCPtr, this, SWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__TImageT_unsigned_short_gcam__kChannelContiguous_t));
        }

        public void setSum_rggb(SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t) {
            GcamModuleJNI.IspAwbMetadata_Statistics_sum_rggb_set(this.swigCPtr, this, SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t));
        }

        public void setSum_sat_rggb(SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t) {
            GcamModuleJNI.IspAwbMetadata_Statistics_sum_sat_rggb_set(this.swigCPtr, this, SWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__TImageT_unsigned_int_gcam__kChannelContiguous_t));
        }
    }

    public IspAwbMetadata() {
        this(GcamModuleJNI.new_IspAwbMetadata(), true);
    }

    public static long getCPtr(IspAwbMetadata ispAwbMetadata) {
        if (ispAwbMetadata == null) {
            return 0L;
        }
        return ispAwbMetadata.swigCPtr;
    }

    public IspAwbMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.IspAwbMetadata_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(IspAwbMetadata ispAwbMetadata) {
        return GcamModuleJNI.IspAwbMetadata_Equals(this.swigCPtr, this, getCPtr(ispAwbMetadata), ispAwbMetadata);
    }

    public Uint8Vector SerializeToBytes() {
        return new Uint8Vector(GcamModuleJNI.IspAwbMetadata_SerializeToBytes(this.swigCPtr, this), true);
    }

    public String SerializeToString(int i) {
        return GcamModuleJNI.IspAwbMetadata_SerializeToString(this.swigCPtr, this, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_IspAwbMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getBit_depth() {
        return GcamModuleJNI.IspAwbMetadata_bit_depth_get(this.swigCPtr, this);
    }

    public int getMax_intensity_b() {
        return GcamModuleJNI.IspAwbMetadata_max_intensity_b_get(this.swigCPtr, this);
    }

    public int getMax_intensity_gb() {
        return GcamModuleJNI.IspAwbMetadata_max_intensity_gb_get(this.swigCPtr, this);
    }

    public int getMax_intensity_gr() {
        return GcamModuleJNI.IspAwbMetadata_max_intensity_gr_get(this.swigCPtr, this);
    }

    public int getMax_intensity_r() {
        return GcamModuleJNI.IspAwbMetadata_max_intensity_r_get(this.swigCPtr, this);
    }

    public long getNumber_of_region_x() {
        return GcamModuleJNI.IspAwbMetadata_number_of_region_x_get(this.swigCPtr, this);
    }

    public long getNumber_of_region_y() {
        return GcamModuleJNI.IspAwbMetadata_number_of_region_y_get(this.swigCPtr, this);
    }

    public long getRegion_height() {
        return GcamModuleJNI.IspAwbMetadata_region_height_get(this.swigCPtr, this);
    }

    public long getRegion_width() {
        return GcamModuleJNI.IspAwbMetadata_region_width_get(this.swigCPtr, this);
    }

    public Statistics getStats() {
        long IspAwbMetadata_stats_get = GcamModuleJNI.IspAwbMetadata_stats_get(this.swigCPtr, this);
        if (IspAwbMetadata_stats_get != 0) {
            return new Statistics(IspAwbMetadata_stats_get, false);
        }
        return null;
    }

    public boolean getValid_saturation_data() {
        return GcamModuleJNI.IspAwbMetadata_valid_saturation_data_get(this.swigCPtr, this);
    }

    public void setBit_depth(int i) {
        GcamModuleJNI.IspAwbMetadata_bit_depth_set(this.swigCPtr, this, i);
    }

    public void setMax_intensity_b(int i) {
        GcamModuleJNI.IspAwbMetadata_max_intensity_b_set(this.swigCPtr, this, i);
    }

    public void setMax_intensity_gb(int i) {
        GcamModuleJNI.IspAwbMetadata_max_intensity_gb_set(this.swigCPtr, this, i);
    }

    public void setMax_intensity_gr(int i) {
        GcamModuleJNI.IspAwbMetadata_max_intensity_gr_set(this.swigCPtr, this, i);
    }

    public void setMax_intensity_r(int i) {
        GcamModuleJNI.IspAwbMetadata_max_intensity_r_set(this.swigCPtr, this, i);
    }

    public void setNumber_of_region_x(long j) {
        GcamModuleJNI.IspAwbMetadata_number_of_region_x_set(this.swigCPtr, this, j);
    }

    public void setNumber_of_region_y(long j) {
        GcamModuleJNI.IspAwbMetadata_number_of_region_y_set(this.swigCPtr, this, j);
    }

    public void setRegion_height(long j) {
        GcamModuleJNI.IspAwbMetadata_region_height_set(this.swigCPtr, this, j);
    }

    public void setRegion_width(long j) {
        GcamModuleJNI.IspAwbMetadata_region_width_set(this.swigCPtr, this, j);
    }

    public void setStats(Statistics statistics) {
        GcamModuleJNI.IspAwbMetadata_stats_set(this.swigCPtr, this, Statistics.getCPtr(statistics), statistics);
    }

    public void setValid_saturation_data(boolean z) {
        GcamModuleJNI.IspAwbMetadata_valid_saturation_data_set(this.swigCPtr, this, z);
    }
}
