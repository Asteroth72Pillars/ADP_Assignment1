package za.ac.cput.domain;

import java.util.Date;

/*Booking.java
Booking class
Author: Morokwe Elijah Gafane (219070296)
Date: 25 March 2024
*/

public class Booking {
    private final int bookId;
    private final int guestId;
    private final int roomId;
    private final Date checkInDate;
    private final Date checkOutDate;
    private final int numberOfGuests;

    // Private constructor to be used by the Builder
    private Booking(Builder builder) {
        this.bookId = builder.bookId;
        this.guestId = builder.guestId;
        this.roomId = builder.roomId;
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.numberOfGuests = builder.numberOfGuests;
    }

    public int getBookId() {
        return bookId;
    }

    public int getGuestId() {
        return guestId;
    }

    public int getRoomId() {
        return roomId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    // Static nested Builder class
    public static class Builder {
        private final int bookId;
        private int guestId;
        private int roomId;
        private Date checkInDate;
        private Date checkOutDate;
        private int numberOfGuests;

        public Builder(int bookId) {
            this.bookId = bookId;
        }

        public Builder guestId(int guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder roomId(int roomId) {
            this.roomId = roomId;
            return this;
        }

        public Builder checkInDate(Date checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }

        public Builder checkOutDate(Date checkOutDate) {
            this.checkOutDate = checkOutDate;
            return this;
        }

        public Builder numberOfGuests(int numberOfGuests) {
            this.numberOfGuests = numberOfGuests;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}
