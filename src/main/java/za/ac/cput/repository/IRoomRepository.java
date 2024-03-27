package za.ac.cput.repository;

import za.ac.cput.domain.Room;

import java.util.List;

/*
IRoomRepository class
Author:Mamicky Shiluva Mbiza_216157404_group 14
Date:25 March 2024
 */
public interface IRoomRepository extends IRepository<Room,String>{
    Room create (Room room);
    Room findById(String roomNumber);
    Room update(Room room);
    boolean delete(String roomNumber);

    List<Room> getAll();
}
