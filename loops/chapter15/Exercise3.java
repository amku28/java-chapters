import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String firstWord;
        String secWord;
        int dots = 30;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        firstWord = scan.nextLine();
        dots = dots - firstWord.length();

        System.out.println("Enter second word:");
        secWord = scan.nextLine();
        dots = dots - secWord.length();

        System.out.println("");
        System.out.print(firstWord);
        while (dots != 0) {
            System.out.print(".");
            dots = dots - 1;
        }
        System.out.print(secWord);
    }
}