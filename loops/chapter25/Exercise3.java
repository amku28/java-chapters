import java.lang.Math;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter upper limit");
        int upperLimit = scan.nextInt();
        double square;
        int count = 0;

        for (int i = 1; i <= upperLimit; i++) {
            square = Math.sqrt(i);
            // checks if number is square number
            if (0 == i % square) {
                for (int n = 1; n <= upperLimit; n++) {
                    if (i == n * (n + 1) / 2.0) {
                        //formula checks for triangle number and if true, count++
                        count++;
                    }
                }
            }
        }
        System.out.println("There are " + count + " numbers that are both triangle and square");
    }
}