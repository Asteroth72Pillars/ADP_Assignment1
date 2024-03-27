package za.ac.cput.repository;
import za.ac.cput.domain.Room;

import java.util.ArrayList;
import java.util.List;

/*
RoomRepository class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:25 March 2024
 */
public class RoomRepository implements IRoomRepository{

    private static IRoomRepository repository = null;
    private List<Room> roomList;
    private RoomRepository(){roomList = new ArrayList<>();
    }
    public static IRoomRepository getRepository(){
       if(repository == null) {
         repository = new RoomRepository();
       }
       return repository;
    }
    @Override
    public Room create(Room room){
        return roomList.add(room)?
                room:null;
    }

    @Override
    public Room findById(String roomNumber) {
        for (Room room : roomList) {
            if (roomNumber.equals(room.getRoomNumber())) {
                return room;
            }
            return null;
        }
        return null;
    }
    @Override
    public Room update(Room room){
       String roomNumber =  room.getRoomNumber();
       Room oldRoom = findById(String.valueOf(roomNumber));
       if(oldRoom == null){
           return null;
       }
        boolean sucess =delete(String.valueOf(roomNumber));
        if(sucess){
         if(roomList.add(room)){

             return room;
         }

       }
        return null;
    }


    @Override
   public boolean delete(String roomNumber){
      Room roomDelete = findById(roomNumber);
      if(roomDelete==null){
         return false;
      }
      return roomList.remove(roomDelete);
   }
   @Override
    public List<Room>getAll(){
        return roomList;
   }
}
