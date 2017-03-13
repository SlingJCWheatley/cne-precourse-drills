package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SlingJCWheatley on 3/12/17.
 */
public class Business implements Addressable {
    private String name;
    ArrayList addresses;

    public Business(String newName) {
        name = newName;
    }

    // Getter
    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address addedAddress) {
        addresses.add(addedAddress);
    }
}