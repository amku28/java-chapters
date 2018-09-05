import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int age;
        int time;
        double price;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age:");
        age = scan.nextInt();

        System.out.println("Enter time:");
        time = scan.nextInt();

        if (time < 1700) {
            if (age > 13) {
                price = 5.00;
            } else {
                price = 4.00;
            }
        } else {
            if (age > 13) {
                price = 8.00;
            } else {
                price = 4.00;
            }
        }

        System.out.println("Price of movie ticket is $" + price);
    }
}