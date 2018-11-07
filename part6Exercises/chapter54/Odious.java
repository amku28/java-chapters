import java.util.Scanner;

public class Odious {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter nonnegative integer");
        int n = scan.nextInt();
        System.out.println(odious(n));

        while (n >= 0) {
            System.out.println("Enter nonnegative integer");
            n = scan.nextInt();
            if (n >= 0) {
                System.out.println(odious(n));
            }
        }
    }

    public static boolean odious( int num )
    {
        int count = 0;
        for ( int j = num; j != 0; j = j / 2 ) {
            if (j % 2 == 1) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}