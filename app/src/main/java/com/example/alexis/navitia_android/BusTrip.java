package com.example.alexis.navitia_android;

import java.util.ArrayList;

/**
 * @author Alexis Robin
 * @version 0.5
 * Licensed under the Apache2 license
 */
public class BusTrip extends WayPart {

    private Route route;
    private String busId;
    private ArrayList<TimedStop> stops;

    protected BusTrip(Address from, Address to, double co2Emission, String departureDateTime, String arrivalDateTime, int duration, GeoJSON geoJSON, Route route, String busId, ArrayList<TimedStop> stops) {
        super("Bus Trip", from, to, co2Emission, departureDateTime, arrivalDateTime, duration, geoJSON);
        this.route = route;
        this.busId = busId;
        this.stops = stops;
    }

    public Route getRoute() {
        return route;
    }

    public String getBusId() {
        return busId;
    }

    public ArrayList<TimedStop> getStops() {
        return stops;
    }
}
