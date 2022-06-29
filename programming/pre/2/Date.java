import java.io.*;
import java.util.*;

// Epoch is a Thursday, so 0 is Thursday
public class Date {
  public static void main(String[] args){
    String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
    long year = 1970;
    long day, hour, minute, second;
    String month, dayname;
    long time = System.currentTimeMillis()/1000;
    // second = time%60;
    time = time/60;
    // minute = time%60;
    time = time/60;
    // hour = time%24;
    time = time/24;
    dayname = days[(int)time%7];
    year += 4*time/1461;
    time = time%1461;
    year += time/365;
    if(year%4 == 0){
      time = time%366;
      if(time <31){
        month = "January ";
        day = time+1;
      }else if(time < 60){
        month = "February ";
        day = time-30;
      } else if(time<91){
        month = "March ";
        day = time-59;
      } else if(time<121){
        month = "April ";
        day = time-90;
      } else if(time<152){
        month = "May ";
        day = time-120;
      } else if(time<182){
        month = "June ";
        day = time-151;
      } else if(time<213){
        month = "July ";
        day = time-181;
      } else if(time<243){
        month = "August ";
        day = time-212;
      } else if(time<274){
        month = "September ";
        day = time-242;
      } else if(time<304){
        month = "October ";
        day = time-273;
      } else if(time<335){
        month = "November ";
        day = time-303;
      } else{
        month = "December ";
        day = time-334;
      }
    } else{
      time = time%365;
      if(time <31){
      month = "January ";
      day = time+1;
      }else if(time < 59){
        month = "February ";
        day = time-30;
      } else if(time<90){
        month = "March ";
        day = time-58;
      } else if(time<120){
        month = "April ";
        day = time-89;
      } else if(time<151){
        month = "May ";
        day = time-119;
      } else if(time<181){
        month = "June ";
        day = time-150;
      } else if(time<212){
        month = "July ";
        day = time-180;
      } else if(time<242){
        month = "August ";
        day = time-211;
      } else if(time<273){
        month = "September ";
        day = time-241;
      } else if(time<303){
        month = "October ";
        day = time-272;
      } else if(time<334){
        month = "November ";
        day = time-302;
      } else{
        month = "December ";
        day = time-333;
      }
    }
    System.out.print("American format:\n");
    System.out.println(dayname+", "+month+day+", "+year);
    System.out.print("European format:\n");
    System.out.println(dayname+" "+day+" "+month+year);
  }
}