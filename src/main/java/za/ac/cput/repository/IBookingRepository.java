package za.ac.cput.repository;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Guest;

import java.util.Date;
import java.util.List;

/*IBookingRepositoty.java
IBookingRepository class
Author: Morokwe Elijah Gafane (219070296)
Date: 25 March 2024
*/
public interface IBookingRepository extends IRepository<Booking,String> {
    Booking createBooking(int bookId, int guestId, int roomId, Date checkInDate, Date checkOutDate, int numberOfGuests);
        Booking findById(int bookId);

        List<Booking> findAll();

        boolean deleteBooking(int bookId);
    }


