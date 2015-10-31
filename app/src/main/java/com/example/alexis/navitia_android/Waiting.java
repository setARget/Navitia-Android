package com.example.alexis.navitia_android;

/**
 * @author Alexis Robin
 * @version 0.5.1
 * Licensed under the Apache2 license
 */
public class Waiting extends WayPart {

    protected Waiting(double co2Emission, String departureDateTime, String arrivalDateTime, int duration) {
        super("Waiting", co2Emission, departureDateTime, arrivalDateTime, duration);
    }
}
