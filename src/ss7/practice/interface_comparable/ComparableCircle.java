package ss7.practice.interface_comparable;

import ss6.practice.shape.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) { //ho tro so sanh hon, kem, bang
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }
}
