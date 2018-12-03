import java.util.Arrays;

class Exercise9
{
  
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    int[] arrayE = {4, 3, 2, 1};

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayA, arrayE ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( Arrays.equals( arrayE, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }

  public static boolean myEquals( int[] a, int[] b )
  {
      if (a.equals(b) || b.equals(a)) {
        return true;
      } else {
          return false;
      }
  }
}