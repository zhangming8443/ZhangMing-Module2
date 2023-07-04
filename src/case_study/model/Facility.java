package case_study.model;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double Area;
    private int rentalCost;
    private int maxNumberOfPeoples;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double area, int rentalCost, int maximumPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        Area = area;
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
        return Area;
    }

    public void setArea(double area) {
        Area = area;
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
        return "Facility{" +
                "serviceCode=" + serviceCode +
                ", serviceName='" + serviceName + '\'' +
                ", Area=" + Area +
                ", rentalCost=" + rentalCost +
                ", maximumPeople=" + maxNumberOfPeoples +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
