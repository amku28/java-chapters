import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int hours;
        int zones;
        int depart;
        int arrive;
        double daysOfRecovery;
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of hours of travel:");
        hours = scan.nextInt();

        System.out.println("Number of time zones crossed:");
        zones = scan.nextInt();

        System.out.println("Enter Departure time");
        depart = scan.nextInt();
        if (depart >= 100 && depart < 800) {
            depart = 5;
        }
        else if (depart >= 800 && depart < 1200) {
            depart = 0;
        }
        else if (depart >= 1200 && depart < 1800) {
            depart = 1;
        }
        else if (depart >= 1800 && depart < 2200) {
            depart = 3;
        }
        else if (depart >= 2200 && depart < 100) {
            depart = 4;
        }

        System.out.println("Enter Arrival time");
        arrive = scan.nextInt();
        if (arrive >= 100 && arrive < 800) {
            depart = 3;
        }
        else if (arrive >= 800 && arrive < 1200) {
            arrive = 4;
        }
        else if (arrive >= 1200 && arrive < 1800) {
            arrive = 2;
        }
        else if (arrive >= 1800 && arrive < 2200) {
            arrive = 0;
        }
        else if (arrive >= 2200 && arrive < 100) {
            arrive = 1;
        }

        daysOfRecovery = (hours / 2.0 + (zones - 3) + depart + arrive) / 10.0;
        System.out.println("You need " + daysOfRecovery + " days to recover from jetlag");
    }
}