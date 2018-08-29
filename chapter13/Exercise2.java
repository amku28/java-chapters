import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double g = 32.174;
        double t;
        double d;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        t = scan.nextDouble();

        d = .5 * g * (t * t);
        System.out.println("Distance: " + d);
    }
}