package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Guest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookingRepositoryTest {
    private BookingRepository bookingRepository;

    @BeforeEach
    public void setUp() {
        bookingRepository = new BookingRepository();
    }

    @Test
    public void testCreateBooking() {
        Booking booking = bookingRepository.createBooking(1, 101, 201, new Date(), new Date(), 2);
        assertNotNull(booking);
        assertEquals(1, bookingRepository.findAll().size());
    }

    @Test
    public void testFindById() {
        Booking booking = bookingRepository.createBooking(1, 101, 201, new Date(), new Date(), 2);
        Booking foundBooking = bookingRepository.findById(1);
        assertNotNull(foundBooking);
        assertEquals(booking, foundBooking);
    }

    @Test
    public void testFindById_NotFound() {
        Booking foundBooking = bookingRepository.findById(2);
        assertNull(foundBooking);
    }

    @Test
    public void testDeleteBooking() {
        Booking booking = bookingRepository.createBooking(1, 101, 201, new Date(), new Date(), 2);
        assertTrue(bookingRepository.deleteBooking(1));
        assertEquals(0, bookingRepository.findAll().size());
    }

    @Test
    public void testDeleteBooking_NotFound() {
        assertFalse(bookingRepository.deleteBooking(2));
    }

    @Test
    public void testCreate() {
        Booking.Builder builder = new Booking.Builder(1);
        builder.guestId(101)
                .roomId(201)
                .checkInDate(new Date())
                .checkOutDate(new Date())
                .numberOfGuests(2);

        Booking booking = builder.build();
        assertNotNull(bookingRepository.create(booking));
    }


    @Test
    public void testFindById_String() {
        Booking foundBooking = bookingRepository.findById("1");
        assertNull(foundBooking);
    }
    @Test
    public void testUpdate() {
        Booking.Builder builder = new Booking.Builder(1);
        builder.guestId(101)
                .roomId(201)
                .checkInDate(new Date())
                .checkOutDate(new Date())
                .numberOfGuests(2);

        Booking booking = builder.build();
        assertNotNull(bookingRepository.update(booking));
    }


    @Test
    public void testDelete() {
        assertFalse(bookingRepository.delete("1"));
    }

    @Test
    public void testGetAll() {
        List<Booking> allBookings = bookingRepository.getAll();
        assertNotNull(allBookings);
    }
}
