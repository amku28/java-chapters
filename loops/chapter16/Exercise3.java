import java.util.Scanner;
import java.lang.Math;

public class Exercise3 {
    public static void main(String[] args) {
        int n;
        int nCount = 0;
        double x;
        double xSquare;
        double sumX = 0;
        double sumSquare = 0;
        double sD;
        double avg;
        double avg2;
        double avgSquare;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many numbers:");
        n = scan.nextInt();

        while (nCount != n) {
            System.out.println("Enter x:");
            x = scan.nextDouble();

            System.out.print("x * x: ");
            xSquare = x * x; 
            System.out.println(xSquare);

            sumX = sumX + x;
            sumSquare = sumSquare + xSquare;

            nCount = nCount + 1;
        }

        avg = sumX / n;
        avg2 = avg * avg;
        avgSquare = sumSquare / n;
        System.out.println(avgSquare);
        sD = Math.sqrt(avgSquare - avg2);

        System.out.println("sum " + sumX + "  " + sumSquare);
        System.out.println("Standard Deviation = " + sD);

    }
}