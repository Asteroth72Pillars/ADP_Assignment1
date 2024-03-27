package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomType;

import static org.junit.jupiter.api.Assertions.*;

/*
RoomFactoryTest class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:25 March 2024
 */
public class RoomFactoryTest {
 @Test
     void buildRoom() {
     RoomType roomType = new RoomType(20145879l,"standard",1000);
     Room room = RoomFactory.buildRoom("101",roomType,2,false);
     Room room2 = room;
     assertNotNull(room);
     assertEquals(room,room2);
    }
    @Test

    public void missingDetails() {
        RoomType roomType = new RoomType(101245,"Luxury",2500);
     Room room = RoomFactory.buildRoom("101",null,2,false);
     assertNull(room);
    }

    @Test
   public  void buildGeneratedId() {
        RoomType roomType = new RoomType(15478l,"Luxury",5000);
     Room room = RoomFactory.buildRoom("102",roomType,3,true);
     Room room2 = room;
     assertNotNull(room);
     assertEquals(room,room2);
    }
}
