package ss5.exercise;

public class Circle {
    private double radius = 1.0;
    private static final double PI = 3.1415;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * PI;
    }
}
