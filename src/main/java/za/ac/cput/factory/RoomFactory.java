package za.ac.cput.factory;
import za.ac.cput.domain.Room;
import za.ac.cput.Util.Helper;
import za.ac.cput.domain.RoomType;

/*
RoomFactory class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:24 March 2024
 */
public class RoomFactory {
 public static Room buildRoom(String roomNumber, RoomType roomType, int capacity, boolean isOccupied){
     if (Helper.isNullOrEmpty(roomNumber) || Helper.isNullOrEmpty(roomType.toString())){
         return null;
     }
     return new Room.Builder().setRoomNumber(roomNumber)
             .setRoomType(roomType)
             .setCapacity(capacity)
             .setOccupied(isOccupied)
             .build();
 }
}
