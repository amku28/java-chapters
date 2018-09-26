import java.util.Scanner;
import java.lang.Math;

public class Exercise2 {
    public static void main(String[] args) {
        int n;
        int sumOfSquares = 0;
        int sumOfCubes = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Upper Limit:");
        n = scan.nextInt();

        while (n != 0) {
            sumOfSquares = sumOfSquares + (n * n);
            sumOfCubes = sumOfCubes + (n * n * n);
            n = n - 1;
        }

        System.out.println("The sum of Squares is " + sumOfSquares);
        System.out.println("The sum of Cubes   is " + sumOfCubes);
    }
}