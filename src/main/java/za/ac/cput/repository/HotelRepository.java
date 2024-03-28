package za.ac.cput.repository;

/*HotelRepository.java
HotelRepository class
Author: Jade John Arendse
Date: 24 March 2024
*/

import za.ac.cput.domain.Hotel;
import java.util.ArrayList;
import java.util.List;

public class HotelRepository implements IHotelRepository {
    public static IHotelRepository hotelRepo = null;
    private List <Hotel> hotelList;

    public HotelRepository() {
        hotelList = new ArrayList<Hotel>();
    }

    public static IHotelRepository getRepository() {
        if (hotelRepo == null) {
            hotelRepo = new HotelRepository();
        }
        return hotelRepo;
    }

    @Override
    public Hotel create(Hotel hotel) {
        return hotelList.add(hotel) ? hotel : null;
    }

    @Override
    public Hotel findById(String s) {
        for (Hotel h : hotelList) {
            if (s.equals(h.getHotelID())) {
                System.out.println("success");
                return h;
            }
        }
        return null;
    }

    @Override
    public Hotel update(Hotel hotel) {
        String id = hotel.getHotelID();
        Hotel oldHotel = findById(id);
        if (oldHotel == null) {
            return null;
        }
        boolean success = delete(id);
        if (success) {
            if (hotelList.add(hotel)) ;
            return hotel;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Hotel hotelDelete = findById(id);
        if (hotelDelete == null)
            return false;
        return (hotelList.remove(hotelDelete));
    }
    @Override
    public List<Hotel> getAll() {
        return hotelList;
    }
}
