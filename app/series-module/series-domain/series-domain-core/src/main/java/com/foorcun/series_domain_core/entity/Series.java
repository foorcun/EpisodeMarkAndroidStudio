package com.foorcun.series_domain_core.entity;

import com.foorcun.common_domain.entity.AggregateRoot;
import com.foorcun.series_domain_core.value_object.SeriesDocumentId;
import com.foorcun.series_domain_core.value_object.SeriesName;

public class Series extends AggregateRoot<SeriesDocumentId> {

    private final SeriesName seriesName;

    private Series(Builder builder) {
        seriesName = builder.seriesName;
        super.setId(builder.seriesDocumentId);
    }

    public SeriesName getSeriesName() {
        return seriesName;
    }


    public static final class Builder {
        private SeriesName seriesName;
        private SeriesDocumentId seriesDocumentId;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder seriesName(SeriesName val) {
            seriesName = val;
            return this;
        }

        public Builder seriesDocumentId(SeriesDocumentId val) {
            seriesDocumentId = val;
            return this;
        }

        public Series build() {
            return new Series(this);
        }
    }
}
