import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        int aSquared;
        int bSquared;
        int sum;

        for (int a = 0; a <= n; a++) {
            aSquared = a * a;
            for (int b = 0; b <= n; b++) {
                bSquared = b * b;
                if (n == aSquared + bSquared) {
                    System.out.println(n + " is a sum of two squares, " + a + " and " + b );
                    break;
                }
            }
        }
    }
}