public class Cylinder {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return Math.PI * (radius * radius) * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * (radius * radius) + 2 * Math.PI * radius * height;
    }
}