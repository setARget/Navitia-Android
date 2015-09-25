package com.example.alexis.navitia_android;

/**
 * @author Alexis Robin
 * @version 0.5.1
 * Licensed under the Apache2 license
 */
public abstract class WayPart {

    private String type = "WayPart";

    private Address from;
    private Address to;
    private double co2Emission;

    private String departureDateTime;
    private String arrivalDateTime;
    private int duration;

    private GeoJSON geoJSON;

    protected WayPart(String type, double co2Emission, String departureDateTime, String arrivalDateTime, int duration){
        this.type = type;
        this.co2Emission = co2Emission;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
        this.from = null;
        this.to = null;
        this.geoJSON = null;
    }

    protected WayPart(String type, Address from, Address to, double co2Emission, String departureDateTime, String arrivalDateTime, int duration, GeoJSON geoJSON){
        this.type = type;
        this.from = from;
        this.to = to;
        this.co2Emission = co2Emission;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
        this.geoJSON = geoJSON;
    }

    public String getType() {
        return type;
    }

    public Address getFrom() {
        return from;
    }

    public Address getTo() {
        return to;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public GeoJSON getGeoJSON() {
        return geoJSON;
    }

}
