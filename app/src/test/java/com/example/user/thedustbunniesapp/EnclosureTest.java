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
    public void maxOutDustBunny(){
        assertEquals(1, enclosure.dustbunnyCount());
        DustBunny  dustBunny1 = new DustBunny("a");
        DustBunny dustBunny2 = new DustBunny("v");

        DustBunny dustBunny3 = new DustBunny("e");
        DustBunny dustBunny4 = new DustBunny("g");
        DustBunny dustBunny5 = new DustBunny("H");

        enclosure.add(dustBunny1);
        enclosure.add(dustBunny2);
        assertEquals(3, enclosure.dustbunnyCount());
        enclosure.add(dustBunny3);
        enclosure.add(dustBunny4);
        enclosure.add(dustBunny5);

        assertEquals(4, enclosure.dustbunnyCount());
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
