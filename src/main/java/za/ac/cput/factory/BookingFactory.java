package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import java.util.Date;

/*BookingFactory.java
BookingFactory class
Author: Morokwe Elijah Gafane (219070296)
Date: 25 March 2024
*/

public class BookingFactory {
    public static Booking createBooking(int bookId, int guestId, int roomId, Date checkInDate, Date checkOutDate, int numberOfGuests) {
        return new Booking.Builder(bookId)
                .guestId(guestId)
                .roomId(roomId)
                .checkInDate(checkInDate)
                .checkOutDate(checkOutDate)
                .numberOfGuests(numberOfGuests)
                .build();
    }
}






