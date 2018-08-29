import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int beginIndex;
        int endIndex;
        String sub;

        System.out.println("Enter a string:");
        str = scan.nextLine();

        System.out.println("Enter beginning index: ");
        beginIndex = scan.nextInt();

        System.out.println("Enter ending index: ");
        endIndex = scan.nextInt();
        sub = str.substring(beginIndex, endIndex);

        System.out.println("Original string: " + str);

        System.out.println("Substring: " + sub);

    }
}