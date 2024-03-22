package za.ac.cput.util;

import java.util.Random;

public class Helper {
    public static boolean isNullOrEmpty(String s){
        if(s==null || s.isEmpty())
            return true;
        return false;
    }

    public static int generateGuestID(){
        Random random=new Random();
        return random.ints(10000000, 100000000).findFirst().getAsInt();
    }
}
