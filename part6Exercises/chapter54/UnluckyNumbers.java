import java.util.Scanner;

public class UnluckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter nonnegative integer");
        long n = scan.nextLong();
        System.out.println(unlucky(n));

        while (n > 0) {
            System.out.println("Enter nonnegative integer");
            n = scan.nextLong();
            if (n > 0) {
                System.out.println(unlucky(n));
            }
        }
    }

    public static boolean unlucky(long num) {

        boolean unlucky = true;
        for ( long j = num; j != 0;) {
            if (j % 10 == 3) {
                j = j / 10;
                if (j % 10 == 1) {
                    return true;
                } else {
                    unlucky = false;
                    j = j / 10;
                }
            } else {
                unlucky = false;
                j = j / 10;
            }
        }
        return unlucky;
    }
}