package case_study.model;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(int serviceCode, String serviceName, double area, int rentalCost, int maximumPeople, String rentalType, String serviceFree) {
        super(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
