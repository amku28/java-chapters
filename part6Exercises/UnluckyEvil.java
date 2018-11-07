import java.util.Scanner;

public class UnluckyEvil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter upper limit");
        int limit = scan.nextInt();

        System.out.println("Enter nonnegative integer");
        long n = scan.nextLong();
        System.out.println(unlucky(n));
        System.out.println(odious(n));

        for(int count = 1; count < limit; count++) {
            System.out.println("Enter nonnegative integer");
            n = scan.nextLong();
            System.out.println(unlucky(n));
            System.out.println(odious(n));
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

    public static boolean odious( long num )
    {
        int count = 0;
        for ( long j = num; j != 0; j = j / 2 ) {
            if (j % 2 == 1) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}