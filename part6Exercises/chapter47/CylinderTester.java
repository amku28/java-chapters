import java.util.Scanner;

public class CylinderTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius, height;

        System.out.println("Enter radius: ");
        radius = scan.nextDouble();

        System.out.println("Enter height: ");
        height = scan.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Volume: " + cylinder.volume() + " Surface Area: " + cylinder.surfaceArea());
    }
}