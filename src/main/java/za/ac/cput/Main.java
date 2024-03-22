package za.ac.cput;

import za.ac.cput.domain.Guest;
import za.ac.cput.factory.GuestFactory;

public class Main {
        public static void main(String args[]){
            Guest g=new Guest.Builder().setGuestId("1").setFirstName("moegamat").setLastName("abzal").
                    setPhoneNumber("0813456723").setAddress("capetown").setEmail("mia@gmail.com").build();
Guest g2= GuestFactory.buildGuest("lil","wayne","01548543621","london street","waynelil@gmail.com");

            System.out.println(g2.toString());


        }
}
