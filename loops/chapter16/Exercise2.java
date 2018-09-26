import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double sum = 0;
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N");
        n = scan.nextInt();

        while (n != 0) {
            sum = sum + 1.0 / n;
            n = n - 1;
        }
        System.out.println("Sum is: " + sum);
    } 
}