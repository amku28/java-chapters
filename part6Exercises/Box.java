public class Box {
    double width;
    double height;
    double length;
    double side;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public Box(double side) {
        this.side = side;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    public double getSide() {
        return this.side;
    }

    double volume() {
        return this.width * this.length * this.height;
    }

    double area() {
        return 2 * this.width * this.length + 2 * this.width * this.height + 2 * this.length * this.height;
    }

    double faceArea() {
        return this.width * this.height;
    }

    double topArea() {
        return this.width * this.length;
    }

    double sideArea() {
        return this.length * this.height;
    }

    public double length() {
        return this.length;
    }

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(oldBox.width() * 1.25, oldBox.height() * 1.25, oldBox.length() * 1.25);
    }

    public Box smallerBox(Box oldBox) {
        return new Box(oldBox.width() * 0.75, oldBox.height() * 0.75, oldBox.length() * 0.75);
    }

    public boolean nests(Box outsideBox) {
        if (outsideBox.width() > this.width && outsideBox.height() > this.height && outsideBox.length() > this.length) {
            return true;
        } else {
            return false;
        }
    }
}