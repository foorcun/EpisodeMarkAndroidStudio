package com.foorcun.series_domain_core.value_object;

import java.util.Objects;

public class SeriesName  {

    private final String seriesName;

    public SeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeriesName that = (SeriesName) o;
        return seriesName.equals(that.seriesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seriesName);
    }
}
