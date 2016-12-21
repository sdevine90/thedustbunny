package com.example.user.thedustbunniesapp;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

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
//        below calls it once and starts it at 100
        dustbunny.getClean();
//        once called once then receive 90
        assertEquals(90.0, dustbunny.getDirty(), 0.1);
//        this brings the counter down to 0
        for(int i=1; i<9; i++){
            dustbunny.getClean();
        }
//        which allows you to return ooo that tickles
        assertEquals("ooo that tickles", dustbunny.getClean());
//        assertEquals("Wed/Dec/21 09:44:42 GMT 2016", dustbunny.currentDate);
    }

//    in this test we have said what the current day is and have returned tomorrows date
    @Test
    public void testGetTomorrow(){
        assertEquals("23 11 2016", dustbunny.addOneToCalendarDate("22 11 2016") );

    }

}
