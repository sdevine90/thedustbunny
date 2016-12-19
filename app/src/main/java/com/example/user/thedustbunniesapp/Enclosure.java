package com.example.user.thedustbunniesapp;

import java.util.ArrayList;


/**
 * Created by user on 16/12/2016.
 */
public class Enclosure {
    private String name;
    private EnclosureType enclosureType;
    private ArrayList<DustBunny> dustBunnies;


    public Enclosure(String name, EnclosureType enclosureType) {
        this.dustBunnies = new ArrayList<DustBunny>();
        this.name = name;
        this.enclosureType = enclosureType;

    }

    public String getName() {

        return name;
    }

    public int dustbunnyCount() {

        return dustBunnies.size();
    }

    public void add(DustBunny dustbunny) {

        dustBunnies.add(dustbunny);
    }

    public void remove(DustBunny dustbunny) {
        dustBunnies.remove(dustbunny);
    }

    public ArrayList<DustBunny> getDustBunnyList(){
        return this.dustBunnies;
    }


}