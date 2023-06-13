package ss6.exercise.circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double h) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = "
                + getRadius()
                + " and "
                + getHeight()
                + "\n"
                + "Volume = "
                + getVolume();

    }
}


