import java.lang.reflect.Array;
import java.util.Arrays;

class Weight
{
  private int[] data;
  
  // Constructor
  public Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int i = 0; i < data.length; i++)
    {
      data[i] = init[i];
    }
  }
  
  //Print
  // Exercise 1
  public String toString()
  {
    String dataString = Arrays.toString(data);
    return dataString;
  }

  // Exercise 2
  public int average() {
    int avg = 0;

    for (int i: data) {
        avg += i;
    }

    avg /= data.length;
    return avg;
  }

  // Exercise 3
  public int subAverage(int start, int end) {
    int subAvg = 0;
    for (int i = start; i < end; i++) {
        subAvg += data[i];
    }

    subAvg = subAvg / (end - start);
    return subAvg;
  }
}