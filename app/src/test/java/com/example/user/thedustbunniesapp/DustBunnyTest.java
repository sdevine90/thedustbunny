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
    public void testSetName(){
        assertEquals("Adam", dustbunny.setName("Adam"));
    }

    @Test
    public void testGetDirty (){
        assertEquals(100.0, dustbunny.getDirty(),0.1);
    }


    @Test
    public void testGetClean(){
        assertEquals("ooo that tickles", dustbunny.getClean());
        assertEquals(90, dustbunny.getDirty(), 0.1);
    }
}
