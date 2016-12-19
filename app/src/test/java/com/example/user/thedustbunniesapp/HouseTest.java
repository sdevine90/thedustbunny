package com.example.user.thedustbunniesapp;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 16/12/2016.
 */

public class HouseTest {
    ArrayList<Enclosure> enclosures;
    Enclosure closet;
    Enclosure couch;
    Enclosure shed;
    Enclosure bed;
    Enclosure shower;
    DustBunny peaches;
    DustBunny sunflower;
    DustBunny stickyfingers;
    House house;


    @Before
    public void before() {
        couch = new Enclosure("under the couch", EnclosureType.UNDER_THE_COUCH);
        closet = new Enclosure("in the closet", EnclosureType.IN_THE_CLOSET);
        shed = new Enclosure("in the shed", EnclosureType.IN_THE_SHED);
        bed = new Enclosure("under the Bed", EnclosureType.UNDER_THE_BED);
        shower = new Enclosure("in the shower", EnclosureType.IN_THE_SHOWER);

        peaches = new DustBunny("Peaches");
        sunflower = new DustBunny("Sunflower");
        stickyfingers = new DustBunny("Sticky Fingers");

        enclosures = new ArrayList<>();
        enclosures.add(couch);
        enclosures.add(closet);
        enclosures.add(shed);
        enclosures.add(bed);
        enclosures.add(shower);



        house = new House(enclosures);
    }

    @Test
    public void testEnclosureCount(){
        assertEquals(5, house.enclosureCount());
    }


    @Test
    public void testsGetEnclosureList(){
        assertEquals(enclosures, house.getEnclosureList());
    }


//gets the name of the dust bunny from within the enclosure
    @Test
    public void testAddDustBunny(){
        house.addDustBunny(peaches, "under the couch");
        assertEquals("under the couch", enclosures.get(0).getName());
        assertEquals("Peaches", peaches.getName());
    }

//    gets the name of the dust bunny and the enclosure it is in
    @Test
    public void findDustBunny(){
        house.addDustBunny(sunflower, "under the couch");
        String result = house.findDustBunnyByName("Sunflower");
        assertEquals("Sunflower is under the couch", result);
    }

}
