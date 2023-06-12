package ss4.excercise;

public class Fan {
    private static final byte SLOW = 1;
    private static final byte MEDIUM = 2;
    private static final byte FAST = 3;

    private int speed = SLOW;

    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on {" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    '\'' + '}';
        }
        return "Fan is off {" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color +
                '\'' + '}';
    }

    public static void main(String[] args) {
        //Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
        //Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        Fan fan = new Fan(FAST, true, 10, "yellow");
        Fan fan1 = new Fan(MEDIUM, false, 5,    "blue");
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
    }
}
