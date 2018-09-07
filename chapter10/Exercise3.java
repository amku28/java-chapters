public class Exercise3 {

    public static void main(String [] args){
        double degrees = 30;
        double rad = degrees * Math.PI/180;
        double theSine = Math.sin(rad);
        double theCosine = Math.cos(rad);
        double theSquare = (theSine * theSine) + (theCosine * theCosine);

        System.out.println("sine:" + theSine + "cosine: " + theCosine + "sum of squares: " + theSquare);
    }
}