import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int stars;
        int numberOfStars = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Initial number of stars:");
        stars = scan.nextInt();

        while (numberOfStars != stars) {
            System.out.print("*");
            numberOfStars = numberOfStars + 1;
            if (numberOfStars == stars) {
                numberOfStars = 0;
                stars = stars - 1;
                System.out.println("");
            }
        }
    }
}