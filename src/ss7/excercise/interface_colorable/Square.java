package ss7.excercise.interface_colorable;

import ss7.excercise.interface_resizeable.Shape;

import javax.swing.*;

public class Square implements IColorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getArea() {
        return side * side;
    }
    @Override
    public String howToColor() {
        return "Color all four sides are blue";
    }

}
