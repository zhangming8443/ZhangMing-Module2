package case_study.model;

public abstract class Person {
    private String name;
    private String date;
    private String identityCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String date, String identityCard, String sdt, String email) {
        this.name = name;
        this.date = date;
        this.identityCard = identityCard;
        this.phoneNumber = sdt;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " | Name: " + name
                + " | Date: " + date
                + " | Identity Card: " + identityCard
                + " | PhoneNumber: " + phoneNumber
                + " | Email: " + email;
    }
}
