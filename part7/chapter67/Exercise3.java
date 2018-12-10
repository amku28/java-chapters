import java.io.* ;

public class Exercise3
{

  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };

    int [] sums = new int[6];
    
    // declare the sum
    int colSum;
    
    // compute the sums for each col
    for ( int row = 0; row < data.length; row++)
    {

      colSum = data[row][0];

      for ( int col=0; col < data[row].length; col++) 
      {
        sums[col] += data[row][col];
      }
    }
      
    for (int v: sums) {
        System.out.println(v);
    }
  }
}      