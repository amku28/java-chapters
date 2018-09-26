import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        long nResult = 1;
        int n;
        int r;
        long rNResult = 1;
        long permutation;

        System.out.println("Enter N:");
        n = scan.nextInt();
        System.out.println("Enter R:");
        r = scan.nextInt();

        if (n >= 0 && r >= 0) {
            r = n - r;
            while (r > 1) {
                rNResult = rNResult * r;
                r = r - 1;
                //calculates n - r factorial
            }
            while (n > 1) {
                nResult = nResult * n;
                n = n -1;
                // calculates n factorial
            }
            permutation = nResult / rNResult;
            System.out.println("The number of permutations is " + permutation);
        }
        else {
            System.out.println("N must be zero or greater");
        }


    }
}