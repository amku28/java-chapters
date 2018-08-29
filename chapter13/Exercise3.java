import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        double x;
        double base2Log;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a double: ");
        x = scan.nextDouble();

        base2Log = Math.log(x) / Math.log(2);
        System.out.println("Base 2 log of " + x + " is: " + base2Log);
    }
}