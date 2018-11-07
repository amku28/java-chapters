import java.util.*;

public class Exercise1
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String inChars;
        int selection;
        int spread;

        Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

        Pantry hubbard = new Pantry( goose, apple, rhub );

        System.out.println("Welcome to Mother Hubbard's Pantry!");

        System.out.println(intro());
        System.out.println( hubbard );

        System.out.println(askSelection());
        selection = scan.nextInt();
        System.out.println(askSpread());
        spread = scan.nextInt();

        hubbard.select(selection);
        hubbard.spread(spread);
            
        while (selection != -1) {
            System.out.println(intro());
            System.out.println( hubbard );

            System.out.println(askSelection());
            selection = scan.nextInt();
            if (selection != -1) {
                System.out.println(askSpread());
                spread = scan.nextInt();

                hubbard.select(selection);
                hubbard.spread(spread);
            } else {
                System.out.println("Good-by");
            }
        }
    }

    public static String intro() {
        return "\nThe jams are:";
    }

    public static String askSelection() {
        return "Enter your selection (1, 2, or 3)";
    }

    public static String askSpread() {
        return "Enter amount to spread";
    }
}