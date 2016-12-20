package com.example.user.thedustbunniesapp;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/12/2016.
 */
public class CurrentDateTest {
    CurrentDate today;

    @Before
    public void before(){
        today = new CurrentDate();
    }

    @Test
    public void currentDate() {
        // gets the current date
        Date testDate = today.getCurrentDate();
        String CurrentDate = (today.toString());
    }
}
