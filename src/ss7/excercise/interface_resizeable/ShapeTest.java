package ss7.excercise.interface_resizeable;

import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Random random = new Random();
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(5, 3);
        shapes[2] = new Square(4);

        for (Shape shape : shapes) {
            System.out.print("Before resizing: ");
            System.out.println("Area = " + shape.getArea() + " and Perimeter = " + shape.getPerimeter());
            double percent = random.nextInt(100) + 1;
            if (shape instanceof Circle) {
                System.out.println("CIRCLE");
                shape.resize(percent);
                System.out.print("After resizing (" + percent + "% Area): ");
                System.out.println("Area = " + shape.getArea() + " and Perimeter = " + shape.getPerimeter());
            }
            if (shape instanceof Square) {
                System.out.println("SQUARE");
                shape.resize(percent);
                System.out.print("After resizing (" + percent + "% Area): ");
                System.out.println("Area = " + shape.getArea() + " and Perimeter = " + shape.getPerimeter());
            }
            else if (shape instanceof Rectangle) {
                System.out.println("RECTANGLE");
                shape.resize(percent);
                System.out.print("After resizing (" + percent + "% Area): ");
                System.out.println("Area = " + shape.getArea() + " and Perimeter = " + shape.getPerimeter());
            }

        }
    }
}
