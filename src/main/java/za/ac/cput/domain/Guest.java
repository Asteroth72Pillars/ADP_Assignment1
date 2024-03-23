package za.ac.cput.domain;

import java.util.*;

/*Guest.java
Guest class
Author: Moegamat Isgak Abzal (221321810)
Date: 19 March 2024
*/
public class Guest {
    private String guestID;
    private String firstName;
    private String lastname;
    private String phoneNumber;
    private String address;
    private String email;

    public Guest() {
    }

    public static class Builder{
        private String guestID;
        private String firstName;
        private String lastname;
        private String phoneNumber;
        private String address;
        private String email;

        public Builder setGuestId(String guestID){
            this.guestID=guestID;
            return this;
        }
        public Builder setFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastname=lastName;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public Builder setAddress(String address){
            this.address=address;
            return this;
        }
        public Builder setEmail(String email){
            this.email=email;
            return this;
        }
        public Builder copy(Guest guest){
            this.guestID=guest.guestID;
            this.firstName=guest.firstName;
            this.lastname=guest.lastname;
            this.phoneNumber=guest.phoneNumber;
            this.address=guest.address;
            this.email=guest.email;
            return this;
        }
        public Guest build(){
            return new Guest(this);
        }

    }
    private Guest(Builder builder){
        this.guestID=builder.guestID;
        this.firstName=builder.firstName;
        this.lastname=builder.lastname;
        this.phoneNumber=builder.phoneNumber;
        this.address=builder.address;
        this.email=builder.email;
    }

    public String getGuestID(){
        return guestID;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return Objects.equals(getGuestID(), guest.getGuestID()) && Objects.equals(getFirstName(), guest.getFirstName()) && Objects.equals(getLastname(), guest.getLastname()) && Objects.equals(getPhoneNumber(), guest.getPhoneNumber()) && Objects.equals(getAddress(), guest.getAddress()) && Objects.equals(getEmail(), guest.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGuestID(), getFirstName(), getLastname(), getPhoneNumber(), getAddress(), getEmail());
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestID='" + guestID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
