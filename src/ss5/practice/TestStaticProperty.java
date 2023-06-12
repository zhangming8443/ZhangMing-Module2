package ss5.practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "E300");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("BMW", "350I");
        System.out.println(Car.numberOfCars);
    }
}
