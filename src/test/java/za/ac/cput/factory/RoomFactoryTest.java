package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Room;

import static org.junit.jupiter.api.Assertions.*;

public class RoomFactoryTest {
 @Test
    void createRoom(){
     RoomType roomType = new RoomType(20145879l,"standard",1000);
     Room room = RoomFactory.createRoom("101",roomType,2,false);
     Room room2 = room;
     assertNotNull(room);
     assertEquals(room,room2);
 }
    @Test

    public void missingDetails() {
        RoomType roomType = new RoomType(101245l,"Luxury",2500);
        Room room = RoomFactory.createRoom("101",null,2,false);
        assertNull(room);
    }

    @Test
    public  void buildGeneratedId() {
        RoomType roomType = new RoomType(15478l,"Luxury",5000);
        Room room = RoomFactory.createRoom("102",roomType,3,true);
        Room room2 = room;
        assertNotNull(room);
        assertEquals(room,room2);
    }
 }

