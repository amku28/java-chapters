import java.util.Scanner;

public class Ch44Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
        int count = 0;
        int i = 0;

        while (count < name.length()) {
            if (name.charAt(count) == ' ') {
                i = count;
            }
            count++;
        }

        String firstName = name.substring(0, i);
        String lastName = name.substring(i, name.length());
        System.out.println(firstName.concat(lastName.toUpperCase()));
    }
}