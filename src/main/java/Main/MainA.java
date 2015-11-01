package Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Bogdan on 31.10.2015.
 */
public class MainA {
    public static void main(String[] args) {
    //ssssssssssssss
        //aaaaaaaaaaaassssssssssssss
        ///s
            //dfshjjjjjjjjjjjjjjjj
            //sssssssssssssssssssss

        SimpleDateFormat formaDate = new SimpleDateFormat("dd"+"."+"MM"+"."+"yy");
        SimpleDateFormat formatTime = new SimpleDateFormat("HH.mm.ss");

        Date date = new Date();
        Date dateIn2day = new Date();
        dateIn2day.setDate(1);
       //Calendar cal = new Calendar();



        System.out.println(formaDate.format(date));
        System.out.println(formatTime.format(date));

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current date: " + calendar.getTime());

      //  calendar.add(Calendar.MONTH, 1);
     //   System.out.println("+1 month: " + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("set day to 1: " + calendar.getTime());

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

//        calendar.add(Calendar.YEAR, -2);
//        System.out.println("2 years ago: " + calendar.getTime());
//
//        calendar.set(Calendar.MONTH, Calendar.MARCH);
//        calendar.set(Calendar.DAY_OF_MONTH, 32);
//        System.out.println("32 of march: " + calendar.getTime());
//
//        calendar.clear(Calendar.MONTH);
//        System.out.println("clear months: " + calendar.getTime());
//
//        calendar.roll(Calendar.WEEK_OF_MONTH, true);
//        System.out.println("roll up week of month: " + calendar.getTime());
    }}
