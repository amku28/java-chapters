import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bolts;
        int nuts;
        int washers;
        int totalCost;

        System.out.println("Number of bolts: ");
        bolts = scan.nextInt();

        System.out.println("Number of nuts: ");
        nuts = scan.nextInt();

        System.out.println("Number of wasers: ");
        washers = scan.nextInt();

        if (!(nuts >= bolts)) {
            System.out.println("Check the Order: too few nuts");
        }

        if (!((washers * 2) >= bolts)) {
            System.out.println("Check the Order: too few washers");
        }

        if (nuts >= bolts && (washers * 2) >= bolts) {
            System.out.println("Order is OK");
        }

        totalCost = (bolts * 5) + (nuts * 3) + washers; //5 = bolt price, 3 = nut price, 1 = washer price
        System.out.println("Total cost: " + totalCost + " cents");
    }
}