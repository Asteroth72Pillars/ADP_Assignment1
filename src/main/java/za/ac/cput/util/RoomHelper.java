package za.ac.cput.util;

import java.util.Random;

public class RoomHelper{
        public static boolean isNullOrEmpty(String s){

            if(s==null || s.isEmpty())
                return true;
            return false;
        }
        public static int generateRoomNumber(){

            Random random = new Random();
            return random.ints(100,1000).findFirst().getAsInt();
        }
}
