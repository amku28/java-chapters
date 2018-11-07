import java.util.Scanner;
public class Ch44Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scan.nextLine();
        String uCase = password.toUpperCase();
        String lCase = password.toLowerCase();
        boolean acceptable = false;

        if (password.length() > 7 && !lCase.equals(password) && !uCase.equals(password)) {
            for (int count = 0; count < password.length(); count++) {
                if (password.charAt(count) == '1' || password.charAt(count) == '2' || password.charAt(count) == '3' || password.charAt(count) == '4' || password.charAt(count) == '5' || password.charAt(count) == '6' || password.charAt(count) == '7' || password.charAt(count) == '8' || password.charAt(count) == '9' || password.charAt(count) == '0'){
                    acceptable = true;
                }
            }
        } else {
            acceptable = false;
        }

        if (acceptable) {
            System.out.println("Acceptable password.");
        } else {
            System.out.println("That password is not acceptable.");
        }
    }
}