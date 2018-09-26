import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();;
        int a = 0;
        int b = n * n;

        for (int count = 1; count <= n; count = count + 2) {
            a = a + count;
        }

        System.out.println("Sum is " + a);
        System.out.println("n squared is " + b);
    }
}