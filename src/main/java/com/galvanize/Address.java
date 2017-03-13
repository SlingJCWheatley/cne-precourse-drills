package com.galvanize;

/**
 * Created by SlingJCWheatley on 3/12/17.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String newStreet, String newCity, String newState, String newZip) {
        street = newStreet;
        city = newCity;
        state = newState;
        zip = newZip;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    // Setters
    public void setStreet(String newStreet) {
        street = newStreet;
    }

    public void setCity(String newCity) {
        city = newCity;
    }

    public void setState(String newState) {
        state = newState;
    }

    public void setZip(String newZip) {
        zip = newZip;
    }

    @Override public String toString() {
        // Format Address to be in single line with ','
        return street + ", " + city + ", " + state + " " + zip;
    }
}