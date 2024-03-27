package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/*BookingFactoryTest.java
BookingFactoryTest class
Author: Morokwe Elijah Gafane (219070296)
Date: 25 March 2024
*/

class BookingFactoryTest {
    @Test
    public void testCreateBooking() {
        int bookId = 1;
        int guestId = 101;
        int roomId = 201;
        Date checkInDate = new Date();
        Date checkOutDate = new Date(checkInDate.getTime() + 86400000);
        int numberOfGuests = 2;

        Booking booking = BookingFactory.createBooking(bookId, guestId, roomId, checkInDate, checkOutDate, numberOfGuests);

        assertNotNull(booking);

        assertEquals(bookId, booking.getBookId());
        assertEquals(guestId, booking.getGuestId());
        assertEquals(roomId, booking.getRoomId());
        assertEquals(checkInDate, booking.getCheckInDate());
        assertEquals(checkOutDate, booking.getCheckOutDate());
        assertEquals(numberOfGuests, booking.getNumberOfGuests());
    }

    @Test
    public void testCreateBookingWithNullDates() {
        int bookId = 1;
        int guestId = 101;
        int roomId = 301; // Changed roomId value to make the test fail
        Date checkInDate = null;
        Date checkOutDate = null;
        int numberOfGuests = 2;

        Booking booking = BookingFactory.createBooking(bookId, guestId, roomId, checkInDate, checkOutDate, numberOfGuests);

        assertNotNull(booking);

        assertEquals(bookId, booking.getBookId());
        assertEquals(guestId, booking.getGuestId());
        assertEquals(roomId, booking.getRoomId());
        assertNull(booking.getCheckInDate());
        assertNull(booking.getCheckOutDate());
        assertEquals(numberOfGuests, booking.getNumberOfGuests());
    }
}
