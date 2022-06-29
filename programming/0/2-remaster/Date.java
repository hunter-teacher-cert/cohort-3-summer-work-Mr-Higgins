import java.io.*;
import java.util.*;

/**
*  Sacred class that houses main.
*/
public class Date {
  /**
  *  Method
  *  Name: main
  *  Prints to STDOUT the date in both American and European formatting based on current system time.
  *  @param  args  Unused String Array for command line arguments.
  */
  public static void main(String[] args){
    // Epoch is a Thursday, so 0 is Thursday.
    String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
    String[] months = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December "};
    // Epoch year is 1970 so let's just initialize there.
    long year = 1970;
    long day, hour;
    // Commented out this initialization because originally I accidentally did date AND time.
    //long minute, second;
    String month, dayname;
    // Don't want milliseconds. The divisions you see are breaking the milliseconds into other units.
    long time = System.currentTimeMillis()/1000;
    //second = time%60;
    // The modulus operations you see are obtaining the values with respect to each unit (the commented ones exist just to explain what each division is for each unit)
    time = time/60;
    //minute = time%60;
    time = time/60;
    //hour = time%24;
    time = time/24;
    // Conversion below since long cannot be used for array index apparently!!
    dayname = days[(int)time%7];
    // Leap year bundles of 4 here being converted to years.
    year += 4*time/1461;
    time = time%1461;
    year += time/365;
    /*
      This long mess is the chain of cases to handle identifying month and day. You'll see the first if is testing if it's a leap year.
    */
    if(year%4 == 0){
      time = time%366;
      if(time <31){
        month = months[0];
        day = time+1;
      }else if(time < 60){
        month = months[1];
        day = time-30;
      } else if(time<91){
        month = months[2];
        day = time-59;
      } else if(time<121){
        month = months[3];
        day = time-90;
      } else if(time<152){
        month = months[4];
        day = time-120;
      } else if(time<182){
        month = months[5];
        day = time-151;
      } else if(time<213){
        month = months[6];
        day = time-181;
      } else if(time<243){
        month = months[7];
        day = time-212;
      } else if(time<274){
        month = months[8];
        day = time-242;
      } else if(time<304){
        month = months[9];
        day = time-273;
      } else if(time<335){
        month = months[10];
        day = time-303;
      } else{
        month = months[11];
        day = time-334;
      }
    } else{
      time = time%365;
      if(time <31){
      month = months[0];
      day = time+1;
      }else if(time < 59){
        month = months[1];
        day = time-30;
      } else if(time<90){
        month = months[2];
        day = time-58;
      } else if(time<120){
        month = months[3];
        day = time-89;
      } else if(time<151){
        month = months[4];
        day = time-119;
      } else if(time<181){
        month = months[5];
        day = time-150;
      } else if(time<212){
        month = months[6];
        day = time-180;
      } else if(time<242){
        month = months[7];
        day = time-211;
      } else if(time<273){
        month = months[8];
        day = time-241;
      } else if(time<303){
        month = months[9];
        day = time-272;
      } else if(time<334){
        month = months[10];
        day = time-302;
      } else{
        month = months[11];
        day = time-333;
      }
    }
    System.out.print("American format:\n");
    System.out.println(dayname+", "+month+day+", "+year);
    System.out.print("European format:\n");
    System.out.println(dayname+" "+day+" "+month+year);
  }
}