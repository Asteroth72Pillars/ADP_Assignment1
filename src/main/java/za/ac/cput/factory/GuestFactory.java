package za.ac.cput.factory;

import za.ac.cput.domain.Guest;
import za.ac.cput.util.Helper;
/*GuestFactory.java
GuestFactory class
Author: Moegamat Isgak Abzal (221321810)
Date: 19 March 2024
*/
public class GuestFactory {
public static Guest buildGuest(String guestID, String firstName, String lastname, String phoneNumber, String address, String email){
    if(Helper.isNullOrEmpty(guestID) || Helper.isNullOrEmpty(firstName) ||Helper.isNullOrEmpty(lastname)
            || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(address) || Helper.isNullOrEmpty(email))
        return null;
    return new Guest.Builder().setGuestId(guestID).setFirstName(firstName).setLastName(lastname)
            .setPhoneNumber(phoneNumber).setAddress(address).setEmail(email).build();
}
public static Guest buildGuest(String firstName, String lastname, String phoneNumber, String address, String email)
{ if( Helper.isNullOrEmpty(firstName) ||Helper.isNullOrEmpty(lastname)
        || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(address) || Helper.isNullOrEmpty(email))
    return null;

    String guestID= String.valueOf(Helper.generateGuestID());
    return new Guest.Builder().setGuestId(guestID).setFirstName(firstName).setLastName(lastname)
            .setPhoneNumber(phoneNumber).setAddress(address).setEmail(email).build();

}
}
