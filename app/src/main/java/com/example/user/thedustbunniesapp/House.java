package com.example.user.thedustbunniesapp;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class House {
    private ArrayList<Enclosure> house;

    public House(ArrayList<Enclosure> enclosures) {
        this.house = new ArrayList<Enclosure>(enclosures);
    }

    public int enclosureCount() {
        return house.size();
    }

    public ArrayList<Enclosure> getEnclosureList() {
        return this.house;
    }

    //    below is finding the enclosure name within the house then adding a bunny into that enclosure
    public void addDustBunny(DustBunny dustbunny, String enclosureName) {
        for (Enclosure enclosure : house) {
            if (enclosureName.equals(enclosure.getName())) {
                enclosure.add(dustbunny);

            }
        }
    }

//for every enclosure in the house I'm getting the list of all bunnies names then if the name is found in the list
//    return the name of the bunny and the enclosure
    public String findDustBunnyByName(String dustBunnyName) {
        for (Enclosure enclosure : house) {
            for (DustBunny dustBunny : enclosure.getDustBunnyList()) {
                if (dustBunnyName.equals(dustBunny.getName())) {
                    return (dustBunny.getName() + " is " + enclosure.getName());
                }
            }
        }
        return null;
    }
}




