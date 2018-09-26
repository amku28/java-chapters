import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        long result = 1;
        int n;

        System.out.print( "Enter N: ");
        n = scan.nextInt();

        if ( n >= 0 ) {
            while ( n > 1 ) {
                result = result * n;
                n = n - 1;
            }
            System.out.println("factorial is " + result);
        }
        else {
            System.out.println("N must be zero or greater");
        }
    }
}