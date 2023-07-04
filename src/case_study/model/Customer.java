package case_study.model;

public class Customer extends Person {
    private String customerCode;
    private String guestType;
    //Diamond, Platinum, Gold, Silver, Member
    private String address;

    public Customer() {
    }

    public Customer(String name, String date, String identityCard, String sdt, String email, String customerCode, String guestType, String address) {
        super(name, date, identityCard, sdt, email);
        this.customerCode = customerCode;
        this.guestType = guestType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
