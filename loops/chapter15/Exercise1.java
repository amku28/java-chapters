import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int startValue;
        int endValue;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Start:");
        startValue = scan.nextInt();

        System.out.println("Enter End:");
        endValue = scan.nextInt();

        while (startValue < endValue + 1) {
            System.out.println(startValue);
            startValue = startValue + 1;
        }
    }
}