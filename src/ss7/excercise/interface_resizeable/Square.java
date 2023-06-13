package ss7.excercise.interface_resizeable;

public class Square extends Rectangle implements IResizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public double getArea() {
        return  super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
