import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years;
        int months;
        int days;
        int seconds;
        double percentage;

        System.out.println("How old are you?");

        System.out.println("Years:");
        years = scan.nextInt();
        years = (((365 * years) * 24) * 60) * 60;

        System.out.println("Months:");
        months = scan.nextInt();
        if (months == 1) {
            months = 31;
        } else if (months == 2) {
            months = 59;
        } else if (months == 3 || months == 5 || months == 7 || months == 9 || months == 11)  {
            //if odd number of months
            months = (((((months / 2) * 31) + (((months - 2) / 2) * 30) + 59) * 24) * 60) * 60;
        } else if (months == 4 || months == 6 || months == 8 || months == 10) {
            months = (((((months -2) / 2) * 31 + (((months - 2) / 2) * 30) + 59) * 24) * 60) * 60;
        }
         
        System.out.println("days:");
        days = scan.nextInt();
        days = ((days * 24) * 60) * 60;

        seconds = days + months + years;
        System.out.println("You've been alive for " + seconds + " seconds");

        percentage = seconds / 2500000000.0;
        System.out.println("You've lived %" + percentage + " of your expected 2.5 billion seconds");
    }
}