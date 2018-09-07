import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contestantWeight;

        System.out.println("Enter contestant's weight: ");
        contestantWeight = scan.nextInt();

        if (contestantWeight >= 30 && contestantWeight <= 250) {
            System.out.println("Contestant qualifies for heavyweight divison");
        } else {
            System.out.println("Contestant doesn't qualify for heavyweight divison");
        }
    }
}