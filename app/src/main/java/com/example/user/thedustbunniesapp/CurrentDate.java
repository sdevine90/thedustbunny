package com.example.user.thedustbunniesapp;



import android.content.Context;
import android.content.SharedPreferences;
import android.text.format.DateFormat;

import java.util.Date;


/**
 * Created by user on 19/12/2016.
 */
public class CurrentDate {
    private Date date;

    public CurrentDate() {
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        this.date = new Date();
//
//        System.out.println(dateFormat.format(date));

    }

    public Date getCurrentDate() {
        return this.date;
        // This gets current date
    }
}

//    Date is just a wrapper around a long milliseconds since 1970-01-01.
//    So you have that already. Date.getTime() will return that, with millisecond precision.
//    long timeMilli = date.getTime();
//    System.out.println("Time in milliseconds using Date class: " + timeMilli);


