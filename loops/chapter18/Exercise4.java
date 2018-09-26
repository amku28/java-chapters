import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int rightFront;
        int leftFront;
        int rightRear;
        int leftRear;
        Scanner scan = new Scanner(System.in);
        boolean inflation = false;

        System.out.println("Input right front pressure");
        rightFront = scan.nextInt();
        if (rightFront < 35 || rightFront > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        System.out.println("Input left front pressure");
        leftFront = scan.nextInt();
        if (leftFront < 35 || leftFront > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        System.out.println("Input right rear pressure");
        rightRear = scan.nextInt();
        if (rightRear < 35 || rightRear > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        System.out.println("Input left rear pressure");
        leftRear = scan.nextInt();
        if (leftRear < 35 || leftRear > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        if ((rightFront <= leftFront + 3 && rightFront >= leftFront - 3) || (rightRear <= leftRear + 3 && rightRear >= leftRear - 3) || (leftFront >= rightFront + 3 && leftFront <= rightFront - 3) || (leftRear >= rightRear + 3 && leftRear <= rightRear - 3)) {
            inflation = true;
        }

        if (inflation) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
        }
    }
}