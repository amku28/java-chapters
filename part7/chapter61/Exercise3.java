import java.io.* ;

class Exercise3
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int closestTo0 = data[0];
    
    
    // find the element nearest to zero
    for (int i : data)
    {
        if (Math.abs(i) < closestTo0) {
            closestTo0 = i;
        }
    }
      
    // write out the element nearest to zero
    System.out.println("The element closest to zero is: " + closestTo0);

  }
}   