import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v, r;
        double i;

        System.out.println("Input volts:");
        v = scan.nextInt();
        
        System.out.println("Input resistance:");
        r = scan.nextInt();

        i = (v + 0.0) / r;

        System.out.println("Current equals = " + i);
    }
}