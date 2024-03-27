package za.ac.cput;

import za.ac.cput.domain.Guest;
import za.ac.cput.factory.GuestFactory;
import za.ac.cput.domain.Booking;
import za.ac.cput.util.Helper;
//import za.ac.cput.util.DateHelper;
import java.util.Date;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        try {
            // Create guest objects
            Guest g = new Guest.Builder()
                    .setGuestId("1")
                    .setFirstName("moegamat")
                    .setLastName("abzal")
                    .setPhoneNumber("0813456723")
                    .setAddress("capetown")
                    .setEmail("mia@gmail.com")
                    .build();

            Guest g2 = GuestFactory.buildGuest("lil", "wayne", "01548543621", "london street", "waynelil@gmail.com");

            System.out.println("Guest 2 Details:");
            System.out.println(g2.toString());

            // Create a booking using the builder pattern
            Booking booking = new Booking.Builder(1)
                    .guestId(101)
                    .roomId(201)
                    .checkInDate(Helper.DateHelper.parseDate("2024-04-01"))
                    .checkOutDate(Helper.DateHelper.parseDate("2024-04-05"))
                    .numberOfGuests(2)
                    .build();

            // Display booking details
            System.out.println("\nBooking Details:");
            System.out.println("Booking ID: " + booking.getBookId());
            System.out.println("Guest ID: " + booking.getGuestId());
            System.out.println("Room ID: " + booking.getRoomId());
            System.out.println("Check-In Date: " + Helper.DateHelper.formatDate(booking.getCheckInDate()));
            System.out.println("Check-Out Date: " + Helper.DateHelper.formatDate(booking.getCheckOutDate()));
            System.out.println("Number of Guests: " + booking.getNumberOfGuests());
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
