public class BoxTester {
    public static void main(String[] args) {
        
        Box box = new Box(2.5, 5.0, 6.0);

        Box oldBox = new Box(box);

        Box theBox = new Box(10.0, 10.0, 10.0);

        System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

        System.out.println( "length: " + box.length + " height: " + box. height +
                            " width: " + box.width )  ;

        System.out.println("topArea: " + box.topArea());
        System.out.println("faceArea: " + box.faceArea());

        System.out.println(oldBox.length());

        System.out.println(oldBox.biggerBox(oldBox).getHeight());

        System.out.println(oldBox.smallerBox(oldBox).getHeight());

        System.out.println(oldBox.smallerBox(oldBox).nests(box));

        System.out.println(box.nests(theBox));
    } 
}