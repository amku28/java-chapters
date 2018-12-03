import java.util.Arrays;

class Exercise10
{
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };
    int[] arrayC = {1, 2, 3, 4, 5};
    int[] arrayD = {1, 2, 1, 2, 1, 2};
    int[] arrayE = {1, 2};

    if ( sameElts( arrayE, arrayB ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );
    
    
  }

  public static boolean sameElts( int[] a, int[] b )
  {
    Arrays.sort(a);
    Arrays.sort(b);
    if (Arrays.equals(a, b)) {
        return true;
    } else {
        return false;
    }
  }
}