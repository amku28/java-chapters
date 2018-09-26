import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    int checkingAccount;
    int savingsAccount;
    boolean serviceCharge = false;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter checking account balance: ");
    checkingAccount = scan.nextInt();

    System.out.print("Enter savings account balance: ");
    savingsAccount = scan.nextInt();

    if (savingsAccount > 1500 || checkingAccount > 1000) {
      serviceCharge = true;
    }

    if (serviceCharge) {
      System.out.println("The service charge is $0.15 per check.");
    } else {
      System.out.println("There is no service charge");
    }
  }
}
