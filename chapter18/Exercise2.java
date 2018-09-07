import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int rFront;
        int lFront;
        int rRear;
        int lRear;
        boolean inflation = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input right front pressure");
        rFront = scan.nextInt();
        System.out.println("Input left front pressure");
        lFront = scan.nextInt();

        System.out.println("Input right rear pressure");
        rRear = scan.nextInt();
        System.out.println("Input left rear pressure");
        lRear = scan.nextInt();
        
        if (rFront == lFront && rRear == lRear) {
            inflation = true;
        }

        if (inflation) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is not OK");
        }
    }
}