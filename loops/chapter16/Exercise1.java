import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int numberOfInts;
        int integers;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers will be added:");
        numberOfInts = scan.nextInt();

        while (numberOfInts != 0) {
            System.out.println("Enter an integer:");
            integers = scan.nextInt();
            sum = sum + integers;
            numberOfInts = numberOfInts - 1;
        }

        System.out.println("");
        System.out.println("The sum is " + sum);
    }
}