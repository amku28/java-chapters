import java.lang.Math;

public class Exercise1 {
    public static void main(String[] args) {
        double n;
        int year;
        double power = 0.83;

        for (int t = 0; t < 25; t++) {
            n = 220/(1 + 10 * (power*=0.83));
            n = Math.round(n);
            System.out.println(n);
            if (n >= 80 && n < 90) {
                System.out.println("Sheep can be supervised for " + t + " years");
            }
        }

    }
}