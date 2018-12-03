import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit ");
        int limit = scan.nextInt();       

        int squared = limit * limit;
        int cubed = limit * limit * limit;
        int[] digits = new int[10];

        for (int i = 0; i <= String.valueOf(cubed).length() + 1; i++) {
            digits[i] = cubed % 10;
            cubed = cubed / 10;
        }

        for (int i = String.valueOf(cubed).length() + 2; i < 10; i++) {
            digits[i] = squared % 10;
            squared = squared / 10;
        }

        // for (int i = 0; i < limit; i++) {
            
        // }

        for (int value: digits) {
            if (value != 0) {
                
            }
        }
        for (int value: digits) {
            System.out.println(value);
        }
    }
}