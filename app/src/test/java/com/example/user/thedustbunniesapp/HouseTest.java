package com.example.user.thedustbunniesapp;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class HouseTest {
    House house;
    DustBunny dustBunny;

    @Before
    public void before(){
        house = new House("Closet");
        dustBunny = new DustBunny("Freddy");
    }

    @Test
    public void getName (){
        assertEquals("Closet", house.getName());
    }

    @Test
    public void enclosureStartsEmpty(){
        assertEquals(0, house.dustbunnyCount());
    }

    @Test
    public void addDustBunny(){
        house.add(dustBunny);
        assertEquals(1, house.dustbunnyCount());
    }

    @Test
    public void removeDustBunny(){
        house.remove(dustBunny);
        assertEquals(0, house.dustbunnyCount());
    }
}
