import java.text.*;
public class Exercise1 {
    public static void main(String[] args) {
        double angle;
        double sine;
        DecimalFormat numform = new DecimalFormat("0.000000");

        System.out.println("angle   sine");
        System.out.println("----    ----");

        for (angle = -90; angle <= 90; angle = angle + 15) {
            sine = Math.sin(Math.toRadians(angle));
            if (angle < 0) {
                System.out.println(angle + "   " + numform.format(sine));
            }

            // if (angle = 0) {
            //     System.out.println("  " + angle +  "    " + numform.format(sine));
            // }

            if (angle > 0) {
                System.out.println(" " + angle + "    " + numform.format(sine));

            }
        }
    }
}