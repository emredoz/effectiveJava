package com.efectivejava.access;

public class GeoLocation {
    // private niçin koyduk?
    // Dışarıdan erişim olmasını istemiyoruz. Peki dışarıdan erişilip değiştirilebilir mi?
    // final kullanılabilir mi?
    // Value object nedir?

    private Double lon;
    private Double lat;

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

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
