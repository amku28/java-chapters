import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int change, dollar, quarter, dime, nickel, cent;

        System.out.println("Input change in cents:");
        change = scan.nextInt();
        dollar = change / 100;
        quarter = change % 100 / 25;
        dime = change % 100 % 25 / 10;
        nickel = change % 100 % 25 % 10 / 5;
        cent = change % 100 % 25 % 10 % 5 % 5;

        System.out.println("Your change is: " + dollar + "dollar(s), " + quarter + "quarter(s), " + dime + "dime(s), " + nickel + "nickel(s), " + cent + "cent(s).");
    }
}