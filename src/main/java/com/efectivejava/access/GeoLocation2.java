package com.efectivejava.access;

public final class GeoLocation2 {
    // Value Object kullanımı.
    // Value Object nasıl yapılır.

    public final Double lat;
    public final Double lon;

    public GeoLocation2(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public static void main(){
        GeoLocation2 geoLocation2 = new GeoLocation2(0.0,0.1);

        //geoLocation2.lat = 10.0;
    }
}
