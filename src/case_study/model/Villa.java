package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double area, int rentalCost, int maximumPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
