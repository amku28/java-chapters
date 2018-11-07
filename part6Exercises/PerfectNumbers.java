import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter upper limit");
        int limit = scan.nextInt();
        
        System.out.println(perfectNumber(limit));
        
    }

    public static boolean perfectNumber(int limit) {
        int sum = 0;
        for (int count = 1; count <= limit; count++) {
            sum = 0;
            for (int divider = 1; divider <= count / 2; divider++) {
                if (count % divider == 0) {
                    sum += divider;
                }
            }
            if (sum == count) {
                System.out.println(count);
            }
        }

        if (sum == limit) {
            return true;
        } else {
            return false;
        }
        
    }
}