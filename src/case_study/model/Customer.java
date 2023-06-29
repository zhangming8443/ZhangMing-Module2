package case_study.model;

public class Customer extends Person {
    private String customerCode;
    private String guestType;
    //Diamond, Platinum, Gold, Silver, Member
    private String address;

    public Customer() {
    }

    public Customer(String customerCode, String name, String date, String identityCard, String phoneNumber, String email, String guestType, String address) {
        super(name, date, identityCard, phoneNumber, email);
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

    public String toFileCSV() {
        return this.getCustomerCode() + "," + this.getName() + "," + this.getDate() + "," + this.getIdentityCard() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.getGuestType() + "," + this.getAddress();
    }

    @Override
    public String toString() {
        return "CUSTOMER {"
                + "Customer code: " + customerCode
                + super.toString()
                + " | Guest type: " + guestType
                + " | Address: " + address
                + '}';
    }
}
