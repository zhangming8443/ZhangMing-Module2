package case_study.model.facility;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double area;
    private int rentalCost;
    private int maxNumberOfPeoples;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double area, int rentalCost, int maximumPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxNumberOfPeoples = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfPeoples() {
        return maxNumberOfPeoples;
    }

    public void setMaxNumberOfPeoples(int maxNumberOfPeoples) {
        this.maxNumberOfPeoples = maxNumberOfPeoples;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return "Service code: " + serviceCode
                + " | Service name: " + serviceName
                + " | Area: " + area
                + " | Rental cost: " + rentalCost
                + " | Maximum People: " + maxNumberOfPeoples
                + " | Rental type: " + rentalType;
    }
}
