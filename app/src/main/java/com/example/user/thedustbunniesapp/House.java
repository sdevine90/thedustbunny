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

    public int enclosureCount(){
        return house.size();
    }

    public void getEnclosureList(){
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


//    public dustBunny findDustBunnnyByName(String findName)
//        for (DustBunny dustBunny : ""){
//            if (dustBunnyName = dustBunny.getName()) return dustBunny;
//        }
//        return null;
//    }



}

