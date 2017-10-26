package com.example.android.quakereport;

/**
 * Created by alistair on 10/11/17.
 */

public class Earthquake {
    // Magnitude for earthquake
    private double mMagnitude;

    // Place of earthquake
    private String mPlace;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    /*
    *  Create a new Earthquake object.
    *  @param magnitude is for the earthquake
    *  @param place is location of earthquake
    *  @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
    *  earthquake happened
    *  @param url is the web address of earthquake
    * */

    public Earthquake(double magnitude, String place, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // Get magnitude
    public double getMagnitude() {
        return mMagnitude;
    }

    // Get the place of earthquake
    public String getPlace() {
        return mPlace;
    }

    // Returns the time of the earthquake.
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    // Get url of earthquake
    public String getUrl() {
        return mUrl;
    }

    }



