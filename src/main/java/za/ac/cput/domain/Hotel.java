package za.ac.cput.domain;

import java.util.*;

/*Hotel.java
Hotel class
Author: Jade John Arendse
Date: 24 March 2024
*/

public class Hotel {
    private String hotelID;
    private String hotelName;
    private String hotelAddress;
    private String hotelNum;
    private String hotelEmail;
    private String hotelRating;

    public Hotel() {
    }

    public static class Builder {
        private String hotelID;
        private String hotelName;
        private String hotelAddress;
        private String hotelNum;
        private String hotelEmail;
        private String hotelRating;

        public Hotel.Builder setHotelID(String hotelID) {
            this.hotelID = hotelID;
            return this;
        }

        public Hotel.Builder setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }

        public Hotel.Builder setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }

        public Hotel.Builder setHotelNum(String hotelNum) {
            this.hotelNum = hotelNum;
            return this;
        }

        public Hotel.Builder setHotelEmail(String hotelEmail) {
            this.hotelEmail = hotelEmail;
            return this;
        }

        public Hotel.Builder setHotelRating(String hotelRating) {
            this.hotelRating = hotelRating;
            return this;
        }

        public Hotel.Builder copy(Hotel hotel) {
            this.hotelID = hotel.hotelID;
            this.hotelName = hotel.hotelName;
            this.hotelAddress = hotel.hotelAddress;
            this.hotelNum = hotel.hotelNum;
            this.hotelEmail = hotel.hotelEmail;
            this.hotelRating = hotel.hotelRating;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }
    }

    private Hotel(Hotel.Builder builder){
        this.hotelID = builder.hotelID;
        this.hotelName = builder.hotelName;
        this.hotelAddress = builder.hotelAddress;
        this.hotelNum = builder.hotelNum;
        this.hotelEmail = builder.hotelEmail;
        this.hotelRating = builder.hotelRating;
    }

    public String getHotelID() {
        return hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String getHotelNum() {
        return hotelNum;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel hotel)) return false;
        return Objects.equals(getHotelID(), hotel.getHotelID()) && Objects.equals(getHotelName(), hotel.getHotelName())
                && Objects.equals(getHotelAddress(), hotel.getHotelAddress()) && Objects.equals(getHotelNum(),
                hotel.getHotelNum()) && Objects.equals(getHotelEmail(), hotel.getHotelEmail())
                && Objects.equals(getHotelRating(), hotel.getHotelRating());
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelID, hotelName, hotelAddress, hotelNum, hotelEmail, hotelRating);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelID='" + hotelID + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", hotelNum=" + hotelNum +
                ", hotelEmail='" + hotelEmail + '\'' +
                ", hotelRating=" + hotelRating +
                '}';
    }
}
