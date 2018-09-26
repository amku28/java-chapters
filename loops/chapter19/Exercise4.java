import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int count = 0;

        System.out.print("Enter a word: ");
        word = scan.next();

        while (count != word.length()) {
            System.out.println(word.charAt(count));
            count++;
        }
    }
}