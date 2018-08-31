import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountPurchased;
        int discountedPrice;

        System.out.println("Enter amount of purchases: ");
        amountPurchased = scan.nextInt();

        if (amountPurchased >= 10) {
            discountedPrice = amountPurchased - (amountPurchased / 10);
        } else {
            discountedPrice = 0;
        }

        System.out.println("Discounted price: " + discountedPrice);
        System.out.println("omg!");
        //This is a test

    }
}