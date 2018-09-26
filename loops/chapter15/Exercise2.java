import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        int time;

        System.out.println("Enter a word:");
        word = scan.nextLine();
        time = word.length();

        System.out.println("");
        while (time != 0) {
            System.out.println(word);
            time = time - 1;
        }
    }
}