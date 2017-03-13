package com.galvanize;

import java.util.List;

/**
 * Created by SlingJCWheatley on 3/12/17.
 */
public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address addAddress);
}


