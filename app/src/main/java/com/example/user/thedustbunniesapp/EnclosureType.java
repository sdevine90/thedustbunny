package com.example.user.thedustbunniesapp;

/**
 * Created by user on 16/12/2016.
 */
public enum EnclosureType {
    UNDER_THE_COUCH("under the couch"),
    IN_THE_CLOSET("in the closet"),
    IN_THE_SHED("in the shed"),
    UNDER_THE_BED("under the bed"),
    IN_THE_SHOWER("in the shower");


    private String name;

    EnclosureType(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }




}
