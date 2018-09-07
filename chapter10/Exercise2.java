public class Exercise2 {

    public static void main (String [] args) {
        double theSine = Math.sin(0.5236);
        double theCosine = Math.cos(0.5236);
        double theSquare = (theSine * theSine) + (theCosine * theCosine);

        System.out.println("sine:" + theSine + "cosine: " + theCosine + "sum of squares: " + theSquare);
    }

}
