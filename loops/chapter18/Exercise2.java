import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int rightFront;
        int leftFront;
        int rightRear;
        int leftRear;
        Scanner scan = new Scanner(System.in);
        boolean inflation = false;

        System.out.println("Input right front pressure");
        rightFront = scan.nextInt();

        System.out.println("Input left front pressure");
        leftFront = scan.nextInt();

        System.out.println("Input right rear pressure");
        rightRear = scan.nextInt();

        System.out.println("Input left rear pressure");
        leftRear = scan.nextInt();

        if (rightFront == leftFront && rightRear == leftRear) {
            inflation = true;
        }

        if (inflation) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is not OK");
        }
    }
}