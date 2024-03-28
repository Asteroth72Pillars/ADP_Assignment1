package za.ac.cput.factory;

import za.ac.cput.domain.Hotel;
import za.ac.cput.util.Helper;

/*HotelFactory.java
HotelFactory class
Author: Jade John Arendse
Date: 24 March 2024
*/

public class HotelFactory {
    public static Hotel buildHotel(String hotelID, String hotelName, String hotelAddress, String hotelNum, String hotelEmail, String hotelRating) {
        if(Helper.isNullOrEmpty(hotelID) || Helper.isNullOrEmpty(hotelName) ||Helper.isNullOrEmpty(hotelAddress)
                || Helper.isNullOrEmpty(hotelNum) || Helper.isNullOrEmpty(hotelEmail) || Helper.isNullOrEmpty(hotelRating))
            return null;
        return new Hotel.Builder().setHotelID(hotelID).setHotelName(hotelName).setHotelAddress(hotelAddress)
                .setHotelNum(hotelNum).setHotelEmail(hotelEmail).setHotelRating(hotelRating).build();
    }
    public static Hotel buildHotel(String hotelName, String hotelAddress, String hotelNum, String hotelEmail,
                                   String hotelRating) {
        if (Helper.isNullOrEmpty(hotelName) || Helper.isNullOrEmpty(hotelAddress) || Helper.isNullOrEmpty(hotelNum) || Helper.isNullOrEmpty(hotelRating))
        return null;

        String hotelID2 = String.valueOf(Helper.generateHotelID());
        return new Hotel.Builder().setHotelID(hotelID2).setHotelName(hotelName).setHotelAddress(hotelAddress)
                .setHotelNum(hotelNum).setHotelEmail(hotelEmail).setHotelRating(hotelRating).build();
    }
}
