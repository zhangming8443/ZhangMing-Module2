package ss7.excercise.interface_resizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return length;
    }

    public void setHeight(double height) {
        this.length = height;
    }


    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        length *= (1 + percent / 100);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
