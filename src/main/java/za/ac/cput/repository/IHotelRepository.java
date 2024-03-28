package za.ac.cput.repository;

/*IHotelRepository.java
IHotelRepository class
Author: Jade John Arendse
Date: 24 March 2024
*/

import za.ac.cput.domain.Guest;
import za.ac.cput.domain.Hotel;

import java.util.List;

public interface IHotelRepository extends IRepository<Hotel, String> {
    Hotel create(Hotel hotel);

    Hotel findById(String s);
    Hotel update(Hotel hotel);
    boolean delete(String id);

    List <Hotel> getAll();
}
