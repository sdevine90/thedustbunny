package com.example.user.thedustbunniesapp;


import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
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

    
//    if the user clicks the getClean button it holds the date of when it was clicked
//    if hasnt been clicked in 5 days returns back to 100

}