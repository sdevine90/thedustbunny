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

    public String getClean(){
        this.dirty -=10.0;
        return "ooo that tickles";
    }
//    on click method that when click clean it will add a method +10 etc... that will clean the dust bunny
//    date and time that it arrived a parameter on the class write a function increase time wchi takes in an arugment of
//    the date parameter of the class increases and decreases
}



