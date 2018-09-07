import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        double x;
        double y;
        double mean;
        double h;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        x = scan.nextDouble();

        System.out.println("Enter y: ");
        y = scan.nextDouble();

        mean = (x + y) / 2;
        System.out.println("Arithmetic mean: " + mean);

        h = 2 / (1 / x + 1 / y);
        System.out.println("Harmonic mean: " + h);
    }
}