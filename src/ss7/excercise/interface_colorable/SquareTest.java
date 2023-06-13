package ss7.excercise.interface_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(3);
        squares[1] = new Square();
        squares[2] = new Square(5);

        for (Square square : squares) {
            if (square instanceof Square) {
                IColorable colorabler = (Square) square;
                System.out.println("Area = " + square.getArea());
                System.out.println(colorabler.howToColor());
            }
        }
    }
}
