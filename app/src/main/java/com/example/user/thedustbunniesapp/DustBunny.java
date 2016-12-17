package com.example.user.thedustbunniesapp;


import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class DustBunny {
    String name;
    private double dirty;



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

    public void setDirty(double dirty) {
        this.dirty = dirty;
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

//    date and time that it arrived a parameter on the class write a function increase time wchi takes in an arugment of
//    the date parameter of the class increases and decreases
}



