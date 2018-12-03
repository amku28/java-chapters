import java.io.* ;

class Exercise1
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int totalSum = 0;
    int evenSum = 0;
    int oddSum = 0;
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
        totalSum += data[index];
        if (data[index] % 2 == 0) {
            evenSum += data[index];
        } else {
            oddSum += data[index];
        }
    }
      
    // write out the three sums
    System.out.println("The sum of all elements: " + totalSum);
    System.out.println("The sum of even elements: " + evenSum);
    System.out.println("The sum of odd elements: " + oddSum);
  }
}      