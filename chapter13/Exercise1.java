import java.util.Scanner;

public class Exercise1 {
  public static void main (String[] args) {
    double costPerKilo;
    double hours;
    double annualCost;
    Scanner scan = new Scanner( System.in );
 
    System.out.println("Enter cost per kilowatt-hour in cents: ");
    costPerKilo = scan.nextDouble();

    System.out.println("Enter kilowatt-hours used per year: ");
    hours = scan.nextDouble();

    annualCost = (costPerKilo * hours) / 100;
    System.out.println("Annual cost: " + annualCost);
  }
}