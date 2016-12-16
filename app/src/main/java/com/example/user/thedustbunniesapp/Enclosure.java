package com.example.user.thedustbunniesapp;

import java.util.ArrayList;


/**
 * Created by user on 16/12/2016.
 */
public class Enclosure {
    private String name;
    private ArrayList<DustBunny> enclosure;


    public Enclosure(String name){
        this.enclosure = new ArrayList<DustBunny>();
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public int dustbunnyCount(){
        return enclosure.size();
    }

    public void add(DustBunny dustbunny){
        enclosure.add(dustbunny);
    }

    public void remove(DustBunny dustbunny){
        enclosure.remove(dustbunny);
    }
}

