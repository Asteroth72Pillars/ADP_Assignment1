package za.ac.cput.repository;

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Guest;
import za.ac.cput.factory.BookingFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*BookingRepositoty.java
BookingRepository class
Author: Morokwe Elijah Gafane (219070296)
Date: 25 March 2024
*/

public class BookingRepository implements IBookingRepository {
    private final List<Booking> bookings;
public static IBookingRepository repository=null;

//    public BookingRepository() {
//        this.bookings = new ArrayList<>();
//    }
    public BookingRepository() {
        bookings = new ArrayList<Booking>();
    }

    public static IBookingRepository getRepository() {
        if (repository == null) {
            repository = new BookingRepository();
        }
        return repository;
    }
    @Override
    public Booking createBooking(int bookId, int guestId, int roomId, Date checkInDate, Date checkOutDate, int numberOfGuests) {
        Booking booking = BookingFactory.createBooking(bookId, guestId, roomId, checkInDate, checkOutDate, numberOfGuests);
        bookings.add(booking);
        return booking;
    }

    @Override
    public Booking findById(int bookId) {
        for (Booking booking : bookings) {
            if (booking.getBookId() == bookId) {
                return booking;
            }
        }
        return null; // Return null if booking with the specified bookId is not found
    }

    @Override
    public List<Booking> findAll() {
        return bookings;
    }

    @Override
    public boolean deleteBooking(int bookId) {
        Booking bookingToRemove = findById(bookId);
        if (bookingToRemove != null) {
            bookings.remove(bookingToRemove);
            return true; // Return true if booking is successfully deleted
        }
        return false; // Return false if booking with the specified bookId is not found
    }

    @Override
    public Booking create(Booking entity) {
        return bookings.add(entity) ? entity : null;

    }

    @Override
    public Booking findById(String s) {
        return null;
    }

    @Override
    public Booking update(Booking entity) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Booking> getAll() {
        return null;
    }
}
