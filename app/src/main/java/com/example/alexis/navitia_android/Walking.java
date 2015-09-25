package com.example.alexis.navitia_android;

/**
 * @author Alexis Robin
 * @version 0.5
 * Licensed under the Apache2 license
 */
public class Walking extends WayPart {

    protected Walking(Address from, Address to, double co2Emission, String departureDateTime, String arrivalDateTime, int duration, GeoJSON geoJSON) {
        super("Walking", from, to, co2Emission, departureDateTime, arrivalDateTime, duration, geoJSON);
    }
}
