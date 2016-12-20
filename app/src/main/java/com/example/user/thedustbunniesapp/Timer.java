//package com.example.user.thedustbunniesapp;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by user on 19/12/2016.
// */
//public class Timer {
//
//    private long startTime = 0;
//    private long endTime = 0;
//
//    public void start() {
//        this.startTime = System.currentTimeMillis();
//    }
//
//    public void end() {
//        this.endTime = System.currentTimeMillis();
//    }
//
//    public long getStartTime() {
//        return this.startTime;
//    }
//
//    public long getEndTime() {
//        return this.endTime;
//    }
//
//    public long getTotalTime() {
//        return this.endTime - this.startTime;
//    }
//
//    public static String millisToShortDHMS(long duration) {
//        long days = TimeUnit.MILLISECONDS.toDays(duration);
//        long hours = TimeUnit.MILLISECONDS.toHours(duration)
//                - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(duration));
//        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration)
//                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration));
//        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration)
//                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration));
//


//i'm trying to get a dust bunny from enclosure that is clean but hasn't been sold in
//five days so returns to being dirty


//    static Duration	ofMinutes(long minutes)
//    Obtains a Duration representing a number of standard minutes.

//ofMinutes
//public static Duration ofMinutes(long minutes)
//        Obtains a Duration representing a number of standard minutes.
//        The seconds are calculated based on the standard definition of a minute, where e
//        ach minute is 60 seconds. The nanosecond in second field is set to zero.
//
//        Parameters:
//        minutes - the number of minutes, positive or negative
//        Returns:
//        a Duration, not null
//        Throws:
//        ArithmeticException - if the input minutes exceeds the capacity of Duration

//
//toMinutes
//public long toMinutes()
//        Gets the number of minutes in this duration.
//        This returns the total number of minutes in the duration by dividing the number of seconds by 60.
//
//        This instance is immutable and unaffected by this method call.
//
//        Returns:
//        the number of minutes in the duration, may be negative

//plusMinutes
//public Duration plusMinutes(long minutesToAdd)
//        Returns a copy of this duration with the specified duration in minutes added.
//        This instance is immutable and unaffected by this method call.
//
//        Parameters:
//        minutesToAdd - the minutes to add, positive or negative
//        Returns:
//        a Duration based on this duration with the specified minutes added, not null
//        Throws:
//        ArithmeticException - if numeric overflow occurs
