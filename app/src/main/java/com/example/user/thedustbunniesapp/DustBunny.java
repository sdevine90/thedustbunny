package com.example.user.thedustbunniesapp;


import android.text.format.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DustBunny {
    public String name;
    private double dirty;
    public Date currentDate;
    public Calendar calendarDate;


    public DustBunny(String name) {
        this.name = name;
        this.dirty = 100.0;
        this.currentDate = new Date();
        this.calendarDate = Calendar.getInstance();

    }

    public String getName() {

        return this.name;
    }

    public double getDirty() {
        return this.dirty;
    }

    public String setName(String name) {
        return this.name = name;
    }


//
//    below if statement :minus 10 every time you do a get clean the first if loop double checks
//    to make sure it hasnt gone below 0 and if it has it puts it back up to 0.
//    Once it has reached 0 it returns ooo that tickles. if not it returns null at the moment

    public String getClean() {
        this.dirty -= 10.0;
        if (this.dirty <= 0) {
            this.dirty = 0;
        }
        if (this.dirty == 0) {
            return "ooo that tickles";
        }
        this.currentDate = new Date();
        return null;
    }



    public static String addOneToCalendarDate(String inputDate) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        try {
             date = myFormat.parse(inputDate);
        } catch (ParseException e){

        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE,1);
        date= cal.getTime();
        System.out.println(myFormat.format(date));
        return myFormat.format(date);
    }

//    Use format() instead of parse(). The format() method is for
//    formatting a Date object into a String. The parse() is to parse a String into a Date object.
//

//    public static Calendar checkDaysSince(Date date) {
//        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        cal.add(Calendar.DATE,1);
//        date= cal.getTime();
//        System.out.println(myFormat.format(date));
//        return cal;
//    }



}








