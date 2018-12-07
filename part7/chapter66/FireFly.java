import java.util.Random;

class FireFly {
    Random rand = new Random();

    boolean alive = true;
    double x;
    double y;
    double z;

    public FireFly(double x, double y, double z, boolean alive) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setAlive(boolean status) {
        alive = status;
    }

    public void move() {
        this.x += Math.random() * 2.0 - 1.0;
        this.y += Math.random() * 2.0 - 1.0;
        this.z += Math.random() * 2.0 - 1.0;
    }
}