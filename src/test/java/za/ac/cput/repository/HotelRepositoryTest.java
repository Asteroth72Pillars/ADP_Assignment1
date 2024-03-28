package za.ac.cput.repository;

/*HotelRepositoryTest.java
HotelRepositoryTest class
Author: Jade John Arendse
Date: 24 March 2024
*/

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Hotel;
import za.ac.cput.factory.HotelFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HotelRepositoryTest {
    private static IHotelRepository repository = HotelRepository.getRepository();
    private Hotel hotel = HotelFactory.buildHotel("007462","Jade Stars Hotel",
            "101 Willowberry Drive, Century City","0843206122","JadeStars@jadestars.co.za","9.8");
    private Hotel hotel2= HotelFactory.buildHotel("014897","Stormside Hotels","983 Hourlane Avenue, Golden Curb","0726472433","StormsideHotels12@gmail.com","5.7");
    private Hotel byId;

    @Test
    @Order(1)
    void create(){
        Hotel create = repository.create(hotel);
        Hotel create2 = repository.create(hotel2);
        assertNotNull(create);
        assertNotNull(create2);
        System.out.println("created");
    }

    @Test
    @Order(2)
    void read(){
        Hotel read = repository.findById(hotel.getHotelID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Hotel hotelUpdate = new Hotel.Builder().copy(hotel).setHotelName("Umbrella Hotels").build();
        Hotel update = repository.update(hotelUpdate);
        assertNotNull(update);
        System.out.println("SUCCESS UPDATING NAME");
    }

    @Test
    @Order(4)
    void delete(){
        assertTrue(repository.delete(hotel.getHotelID()));
        System.out.println("guest deleted");
        Hotel read = byId;
    }

    @Test
    @Order(5)
    void getAll(){
        System.out.println(repository.getAll().toString());
    }
}
