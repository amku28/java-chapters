import java.lang.reflect.Array;
import java.util.Arrays;



public class Exercise1
{
  public static void main ( String[] args )
  {
    int[] values = {98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
        105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
        105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    System.out.println( june );

    int avg = june.average();
    System.out.println("average = " + avg );

    int avgFirstHalf = june.subAverage(0, values.length / 2);
    System.out.println("average of first half of month = " + avgFirstHalf);

    int avgSecondHalf = june.subAverage(values.length / 2, values.length);
    System.out.println("average of second half of month = " + avgSecondHalf);

    int difference = avgFirstHalf - avgSecondHalf;
    System.out.println("difference between two halves = " + difference);
  }
}   