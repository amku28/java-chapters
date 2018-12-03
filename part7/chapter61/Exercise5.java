import java.io.*;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] letters = new int[26];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        boolean isPanagram = false;

        for (int count = 0; count < sentence.length(); count++) {
            if (sentence.charAt(count) == 'a') {
                letters[0] = 1;
            } else if (sentence.charAt(count) == 'b'){
                letters[1] = 1;
            } else if (sentence.charAt(count) == 'c'){
                letters[2] = 1;
            } else if (sentence.charAt(count) == 'd'){
                letters[3] = 1;
            } else if (sentence.charAt(count) == 'e'){
                letters[4] = 1;
            } else if (sentence.charAt(count) == 'f'){
                letters[5] = 1;
            } else if (sentence.charAt(count) == 'g'){
                letters[6] = 1;
            } else if (sentence.charAt(count) == 'h'){
                letters[7] = 1;
            } else if (sentence.charAt(count) == 'i'){
                letters[8] = 1;
            } else if (sentence.charAt(count) == 'j'){
                letters[9] = 1;
            } else if (sentence.charAt(count) == 'k'){
                letters[10] = 1;
            } else if (sentence.charAt(count) == 'l'){
                letters[11] = 1;
            } else if (sentence.charAt(count) == 'm'){
                letters[12] = 1;
            } else if (sentence.charAt(count) == 'n'){
                letters[13] = 1;
            } else if (sentence.charAt(count) == 'o'){
                letters[14] = 1;
            } else if (sentence.charAt(count) == 'p'){
                letters[15] = 1;
            } else if (sentence.charAt(count) == 'q'){
                letters[16] = 1;
            } else if (sentence.charAt(count) == 'r'){
                letters[17] = 1;
            } else if (sentence.charAt(count) == 's'){
                letters[18] = 1;
            } else if (sentence.charAt(count) == 't'){
                letters[19] = 1;
            } else if (sentence.charAt(count) == 'u'){
                letters[20] = 1;
            } else if (sentence.charAt(count) == 'v'){
                letters[21] = 1;
            } else if (sentence.charAt(count) == 'w'){
                letters[22] = 1;
            } else if (sentence.charAt(count) == 'x'){
                letters[23] = 1;
            } else if (sentence.charAt(count) == 'y'){
                letters[24] = 1;
            } else {
                letters[25] = 1;
            }
        }

        int sum = 0;
        for (int i : letters) {
            sum += i;
        }
        if (sum == 26) {
            isPanagram = true;
        } else {
            isPanagram = false;
        }

        System.out.println(isPanagram);
     }
}