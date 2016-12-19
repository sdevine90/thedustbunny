package com.example.user.thedustbunniesapp;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {
    Enclosure enclosure;
    DustBunny dustBunny;

    @Before
    public void before(){
        enclosure = new Enclosure("Closet", EnclosureType.IN_THE_CLOSET);
        dustBunny = new DustBunny("Freddy");
        enclosure.add(dustBunny);
    }

    @Test
    public void getName (){
        assertEquals("Closet", enclosure.getName());
    }

//    @Test
//    public void enclosureStartsEmpty(){
//        assertEquals(1, enclosure.dustbunnyCount());
//    }

    @Test
    public void addDustBunny(){
        assertEquals(1, enclosure.dustbunnyCount());
    }

    @Test
    public void removeDustBunny(){
        enclosure.remove(dustBunny);
        assertEquals(0, enclosure.dustbunnyCount());
    }



    @Test
    public void checkEnumName() {
        assertEquals("under the couch", EnclosureType.UNDER_THE_COUCH.getName());
        assertEquals("in the closet", EnclosureType.IN_THE_CLOSET.getName());
        assertEquals("in the shed", EnclosureType.IN_THE_SHED.getName());
        assertEquals("under the bed", EnclosureType.UNDER_THE_BED.getName());
        assertEquals("in the shower", EnclosureType.IN_THE_SHOWER.getName());
    }

        @Test
        public void testsGetDustBunnyList(){
            assertEquals("Freddy", enclosure.getDustBunnyList().get(0).getName());
        }
}
