package com.example.user.thedustbunniesapp;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Date;

/**
 * Created by user on 16/12/2016.
 */
public class DustBunny {
    String name;
    private double dirty;
    Date lastCleanedDate;



    public DustBunny(String name) {
        this.name = name;
        this.dirty = 100.0;

    }

    public String getName() {

        return this.name;
    }

    public double getDirty(){
        return this.dirty;
    }

    public String setName(String name) {
        return this.name = name;
    }



//
//    below if statement :minus 10 every time you do a get clean the first if loop double checks
//    to make sure it hasnt gone below 0 and if it has it puts it back up to 0.
//    Once it has reached 0 it returns ooo that tickles. if not it returns null at the moment

    public String getClean(){
        this.dirty -=10.0;
        if (this.dirty <= 0)
        {
            this.dirty = 0;
        }
        if (this.dirty == 0) {
            return "ooo that tickles";
        }
        return null;
    }




//    ^ above needs a method to save the date when the cleaning happened
//
//    public void lastClean(){
//        long todaysdate = TimeUnit.MILLISECONDS.toDays();
//        if (Date lastCleanedDate = 432000000();{
//        return (dustBunny)this.dirty;
//
//    }
        // always return the same time when querying current time
//        DateTimeUtils.setCurrentMillisFixed(millis);


        // Expire the dust bunny in five minutes (5 * 60)
//        dustBunny.setMaxTime( 300 );

}





