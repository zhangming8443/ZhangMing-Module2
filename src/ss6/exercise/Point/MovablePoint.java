package ss6.exercise.Point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getxSpeed(), getySpeed()};
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                + "("
                + getX()
                + ", "
                + getY()
                + "),speed = ("
                + xSpeed
                + ", "
                + ySpeed
                + ")}";
    }

    public MovablePoint move(float x, float y, float xSpeed, float ySpeed) {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 3);
        System.out.println(movablePoint);
    }
}
