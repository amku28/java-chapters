import java.util.Scanner;

public class Exercise1
{
  public static void main (String[] args)
  { 
    Scanner scan = new Scanner( System.in );
    int radius;
    double circleArea;      // declare two int variables 

    System.out.println("Enter a radius:");
    radius = scan.nextInt();
    circleArea = Math.PI * (radius * radius) ; 

    System.out.println("The radius is:" + radius + "The area is:" + circleArea);
  }
}