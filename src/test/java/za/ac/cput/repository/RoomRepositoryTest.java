package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.RoomType;
import za.ac.cput.factory.RoomFactory;
import za.ac.cput.domain.Room;
import za.ac.cput.factory.RoomFactory;
import za.ac.cput.factory.RoomTypeFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
RoomFactory class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:24 March 2024
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class RoomRepositoryTest {
    private static IRoomRepository repository = RoomRepository.getRepository();
    private RoomType roomType1 = RoomTypeFactory.createRoomType(2145l,"Standard",200.0);
    private RoomType roomType2 = RoomTypeFactory.createRoomType(5687l,"Deluxe",400.0);
    private Room room= RoomFactory.buildRoom("101",roomType1,2,false);
    private Room room2= RoomFactory.buildRoom("101",roomType2,2,false);

    @Test
    @Order(1)
    void create(){
       Room create = repository.create(room);
       Room create2 = repository.create(room2);

       assertNotNull(create);
       assertNotNull(create2);
       System.out.println("Rooms created");
    }
    @Test
    @Order(2)
    void read(){
        Room read = repository.findById(room.getRoomNumber());
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    @Order(3)
    void update(){
        Room roomUpdate = new Room.Builder().copy(room).setRoomNumber("101").build();
        Room update = repository.update(roomUpdate);
        assertNotNull(update);
        System.out.println("SUCCESS UPDATING PRICE PER NIGHT");
    }
    @Test
    @Order(5)
    void delete(){
        assertTrue(repository.delete(room.getRoomNumber()));
        System.out.println("Room deleted");
    }
    @Test
    @Order(5)
    void getAll(){
        System.out.println(repository.getAll().toString());
    }

}
