import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int cents;
        int dollars;

        System.out.println("Input the cents:");
        cents = scan.nextInt();
        dollars = cents / 100;
        cents = cents % 100;

        System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
    }
}