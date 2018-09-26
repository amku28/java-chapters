import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of guests");
        int n = scan.nextInt();
        double probability = 1.0;

        for (int i = 2; i <= n; i++) {
            probability = ((365 - (i - 1)) / 365.0 * probability);
        }
        System.out.println("There is a probability of " + probability + " that " + n + " people have different birthdays");
    }
}