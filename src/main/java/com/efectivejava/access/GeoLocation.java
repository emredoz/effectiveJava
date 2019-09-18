package com.efectivejava.access;

public class GeoLocation {

    private final Double lon;
    private final Double lat;

    public GeoLocation(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public Double getLat() {
        return lat;
    }
}
