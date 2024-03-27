package za.ac.cput.factory;
import za.ac.cput.domain.Room;
import za.ac.cput.util.RoomHelper;

/*RoomFactory.java 
Room class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:23 March 2024
 */
public class RoomFactory {
    public static Room createRoom(String roomNumber, RoomType roomType, int capacity, boolean isOccupied)
    {
        if (RoomHelper.isNullOrEmpty(roomNumber) || RoomHelper.isNullOrEmpty(roomType.toString())){
            return null;
        }
        return new Room.Builder().setRoomNumber(roomNumber)
                .setRoomType(roomType)
                .setCapacity(capacity)
                .setOccupied(isOccupied)
                .build();


    }
}

