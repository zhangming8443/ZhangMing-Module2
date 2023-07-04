package case_study.model.person;

public class Employee extends Person {
    private String employeeCode;
    private String degree;
    private String duty;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeCode, String name, String date, String identityCard, String phoneNumber, String email, String degree, String duty, int salary) {
        super(name, date, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.degree = degree;
        this.duty = duty;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toFileCSV() {
        return this.getEmployeeCode() + "," + this.getName() + "," + this.getDate() + "," + this.getIdentityCard() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.getDegree() + "," + this.getDuty() + "," + this.getSalary();
    }

    @Override
    public String toString() {
        return "EMPLOYEE {"
                + "Employee code: " + employeeCode
                + super.toString()
                + " | Degree: " + degree
                + " | Duty: " + duty
                + " | Salary: " + salary
                + '}';
    }
}
