package com.example.alexis.navitia_android;

import java.util.ArrayList;

/**
 * @author Alexis Robin
 * @version 0.6
 * Licensed under the Apache2 license
 */
public class Way {

    private String label;

    private double co2Emission;
    private String departureDateTime;
    private String arrivalDateTime;
    private int duration;

    private ArrayList<WayPart> parts;
    private int currentPartKey;

    public Way(String label, double co2Emission, String departureDateTime, String arrivalDateTime, int duration, ArrayList<WayPart> parts) {
        this.label = label;
        this.co2Emission = co2Emission;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
        this.parts = parts;
        this.currentPartKey = 0;
    }

    public String getLabel() {
        return label;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<WayPart> getParts() {
        return parts;
    }

    public void updateDuration(Coordinate c){

        this.getParts().get(this.currentPartKey).updateDuration(c);

        int durationUpdated = 0;
        for(WayPart wayPart : this.getParts()){
            durationUpdated += wayPart.getDuration();
        }
        this.duration = durationUpdated;

    }

    @Override
    public String toString(){
        String ret = "";
        for(WayPart wayPart : this.getParts()){
           ret += wayPart.toString() + "\n";
        }
        return ret;
    }
}
