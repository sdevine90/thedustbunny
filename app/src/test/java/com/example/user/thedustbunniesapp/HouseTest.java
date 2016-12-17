package com.example.user.thedustbunniesapp;

import org.junit.Before;

/**
 * Created by user on 16/12/2016.
 */

public class HouseTest {
    Enclosure closet;
    Enclosure couch;
    DustBunny dustBunny;

    @Before
    public void before() {
        closet = new Enclosure("Closet", EnclosureType.IN_THE_CLOSET);
        dustBunny = new DustBunny("Freddy");
    }
}