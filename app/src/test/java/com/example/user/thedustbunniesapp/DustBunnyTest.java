package com.example.user.thedustbunniesapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class DustBunnyTest {
        DustBunny dustbunny;

        @Before
        public void before(){
            dustbunny = new DustBunny("Freddy");
        }

    @Test
    public void testGetName (){
        assertEquals("Freddy", dustbunny.getName());
    }

    @Test
    public void testGetClean (){
        assertEquals(100.0, dustbunny.getClean(),0.1);
    }
}
