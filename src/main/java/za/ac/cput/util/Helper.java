package za.ac.cput.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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



    public class DateHelper {
        private static final String DATE_FORMAT = "yyyy-MM-dd";

        public static Date parseDate(String dateString) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            return dateFormat.parse(dateString);
        }

        public static String formatDate(Date date) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            return dateFormat.format(date);
        }
    }

}
