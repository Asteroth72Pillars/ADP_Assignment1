package za.ac.cput.factory;

/*HotelFactoryTest.java
HotelFactoryTest class
Author: Jade John Arendse
Date: 24 March 2024
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Hotel;

import static org.junit.jupiter.api.Assertions.*;

public class HotelFactoryTest {
    @Test
    void buildHotel(){
        Hotel h = HotelFactory.buildHotel("007462","Jade Stars Hotel","101 Willowberry Drive, Century City","0843206122","JadeStars@jadestars.co.za","9.8");
        Hotel h2 = h;

        assertNotNull(h);
        assertEquals(h, h2);
    }
    @Test
    void missingDetails(){
        Hotel h = HotelFactory.buildHotel("007462","Jade Stars Hotel","101 Willowberry Drive, Century City","0843206122",null,"9.8");
        assertNull(h);
    }
    @Test
    void buildGeneratedId(){
        Hotel h = HotelFactory.buildHotel("Jade Stars Hotel","101 Willowberry Drive, Century City","0843206122","JadeStars@jadestars.co.za","9.8");
        Hotel h2 = h;

        assertNotNull(h);
        assertEquals(h, h2);

    }
}
