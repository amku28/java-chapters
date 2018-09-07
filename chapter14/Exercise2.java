import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        double p;
        double r;
        int n;
        int t;
        double v;
        Scanner scan = new Scanner(System.in);

        System.out.println("Initial deposit: ");
        p = scan.nextDouble();

        System.out.println("Interest rate: ");
        r = scan.nextDouble();

        System.out.println("Times per year: ");
        n = scan.nextInt();

        System.out.println("Number of years: ");
        t = scan.nextInt();

        v = p * Math.pow(1 + r / n, n * t);
        v = (int)(v * 100);
        v = v / 100;
        System.out.println("Value: $" + v);
    }
}