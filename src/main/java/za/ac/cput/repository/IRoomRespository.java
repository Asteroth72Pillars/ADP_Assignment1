package za.ac.cput.repository;

import za.ac.cput.domain.Room;

import java.util.List;
/*IRoomRespository.java
Room class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:23 March 2024
 */
public interface IRoomRespository  extends IRepository<Room,String>{
    Room create (Room room);
    Room findById(String roomNumber);
    Room update(Room room);
    boolean delete(String roomNumber);

    List<Room> getAll();
}
