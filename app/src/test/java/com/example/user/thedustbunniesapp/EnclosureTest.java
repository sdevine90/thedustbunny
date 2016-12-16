package com.example.user.thedustbunniesapp;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {
    Enclosure enclosure;
    DustBunny dustBunny;

    @Before
    public void before(){
        enclosure = new Enclosure("Closet");
        dustBunny = new DustBunny("Freddy");
    }

    @Test
    public void getName (){
        assertEquals("Closet", enclosure.getName());
    }

    @Test
    public void enclosureStartsEmpty(){
        assertEquals(0, enclosure.dustbunnyCount());
    }

    @Test
    public void addDustBunny(){
        enclosure.add(dustBunny);
        assertEquals(1, enclosure.dustbunnyCount());
    }

    @Test
    public void removeDustBunny(){
        enclosure.remove(dustBunny);
        assertEquals(0, enclosure.dustbunnyCount());
    }
}
