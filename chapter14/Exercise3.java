import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        double r;
        double years;
        Scanner scan = new Scanner(System.in);

        System.out.println("Interest rate: ");
        r = scan.nextDouble();

        years = 72 / r;
        System.out.println("It will take " + years + " year(s) to double your money.");


    }
}