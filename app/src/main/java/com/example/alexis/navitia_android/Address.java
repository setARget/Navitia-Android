package com.example.alexis.navitia_android;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexis Robin
 * @version 0.6
 * Licensed under the Apache2 license
 */
public class Address implements Parcelable {

    protected double lat, lon;
    protected String name;
    protected int icon, nameId;

    public Address(){

    }

    public Address(String name, int icon){
        this.name = name;
        this.icon = icon;
    }

    public Address(int name, int icon){
        this.nameId = name;
        this.icon = icon;
    }

    public Address(String name, int icon, double lat, double lon){
        this.name = name;
        this.icon = icon;
        this.lat = lat;
        this.lon = lon;
    }

    public Address(int name, int icon, double lat, double lon){
        this.nameId = name;
        this.icon = icon;
        this.lat = lat;
        this.lon = lon;
    }

    public Address(Parcel in){
        name = in.readString();
        icon = in.readInt();
        nameId = in.readInt();
        lat = in.readDouble();
        lon = in.readDouble();
    }

    public String getName(Context c){
        return (name != null) ? name : c.getString(nameId);
    }

    public int getIcon(){
        return icon;
    }

    public double getLongitude(){
        return lat;
    }
    public double getLatitude(){
        return lon;
    }

    public void setLatitude(double lat){
        this.lat = lat;
    }

    public void setLongitude(double lon){
        this.lon = lon;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(icon);
        dest.writeInt(nameId);
        dest.writeDouble(lat);
        dest.writeDouble(lon);
    }

    public static final Creator CREATOR =
            new Creator() {

                @Override
                public Object createFromParcel(Parcel in) {
                    return new Address(in);
                }

                public Address[] newArray(int size) {
                    return new Address[size];
                }
            };

}