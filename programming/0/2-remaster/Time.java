import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Time {
  public static void main(String[] args){
    //To avoid needlessly long floats...
    DecimalFormat formatter = new DecimalFormat("##.00##");
    
    //Program birth: 1300 21st of June, 2022
    //UNIX timestamps obtained at project start and finish from unixtimestamp.com.
    long programEpoch = 1655830800;
    long programEnd = 1655831993;
    long hour, minute, second, secondsPassed, projectTime;
    double percent;
    long secondsInDay = 86400;
    long time = System.currentTimeMillis()/1000;
    projectTime = time-programEpoch;
    second = time%60;
    time = time/60;
    minute = time%60;
    time = time/60;
    //Conversion for EDT.
    hour = (time%24)-4;
    secondsPassed = hour*60*60+minute*60+second;
    percent = 100*(double)secondsPassed/(double)secondsInDay;
    System.out.println("The number of seconds since midnight in EDT (GMT-4) is "+secondsPassed+".");
    System.out.println("The number of seconds remaining in EDT (GMT-4) is "+String.valueOf(secondsInDay-secondsPassed)+".");
    System.out.println("The percentage of the day that has passed is "+formatter.format(percent)+"%.");
    System.out.println("The number of seconds it has been since the start of this project is "+projectTime+". Only "+String.valueOf(programEnd-programEpoch)+" seconds were used to make this project.");
  }
}