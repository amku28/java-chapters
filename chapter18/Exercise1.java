import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double checkAccount;
        double saveAccount;
        double charge;
        boolean serviceCharge = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter checking account balance:");
        checkAccount = scan.nextDouble();
        if (checkAccount < 1000) {
            serviceCharge = true;
        }

        System.out.println("Enter saving account balance:");
        saveAccount = scan.nextDouble();
        if (saveAccount < 1500) {
            serviceCharge = true;
        }

        if (serviceCharge) {
            charge = 0.15;
        } else {
            charge = 0;
        }

        System.out.println("Service charge = $" + charge + " per check");
    }
}