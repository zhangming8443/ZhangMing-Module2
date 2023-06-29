package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final Scanner scanner = new Scanner(System.in);
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        String employeeCode;
        do {
            System.out.println("Enter the employee code: ");
            employeeCode = scanner.nextLine();
        } while (!Regex.regexEmployeeCode(employeeCode));

        String name;
        do {
            System.out.println("Enter the employee name: ");
            name = scanner.nextLine();
        } while (!Regex.regexName(name));

        String date;
        do {
            System.out.println("Enter the employee date: ");
            date = scanner.nextLine();
        } while (!Regex.regexDate(date));

        String identityCard;
        do {
            System.out.println("Enter the employee identity card: ");
            identityCard = scanner.nextLine();
        } while (!Regex.regexIdentityCard(identityCard));

        String phoneNumber;
        do {
            System.out.println("Enter the employee phone number: ");
            phoneNumber = scanner.nextLine();
        } while (!Regex.regexPhoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Enter the employee email: ");
            email = scanner.nextLine();
        } while (!Regex.regexEmail(email));

        String degree;
        do {
            System.out.println("Enter the employee degree: "); //Trung Cap/Cao Dang/Dai Hoc/Sau Dai Hoc
            degree = scanner.nextLine();
        } while (!Regex.regexDegree(degree));

        String duty;
        do {
            System.out.println("Enter the employee duty: "); //Le Tan/Phuc Vu/Chuyen Vien/Giam Sat/Quan Ly/Giam Doc
            duty = scanner.nextLine();
        } while (!Regex.regexDuty(duty));


        int salary;
        do {
            System.out.println("Enter the employee salary: ");
            salary = Integer.parseInt(scanner.nextLine());
        } while (salary < 0);

        Employee employee = new Employee(employeeCode, name, date, identityCard, phoneNumber, email, degree, duty, salary);
        employeeRepository.addNew(employee);
        System.out.println("COMPLETE ADD NEW EMPLOYEE !");
    }

    @Override
    public void editEmployee() {
        System.out.println("Enter the employee code to edit employee: ");
        String employeeCode = scanner.nextLine();
        Employee employee = employeeRepository.getByEmployeeCode(employeeCode);

        if (employee == null) {
            System.out.println("NOT FOUND EMPLOYEE CODE !");
        } else {
            String name;
            do {
                System.out.println("Enter the name employee to edit: ");
                name = scanner.nextLine();
            } while (!Regex.regexName(name));

            String date;
            do {
                System.out.println("Enter the date employee to edit: ");
                date = scanner.nextLine();
            } while (!Regex.regexDate(date));

            String identityCard;
            do {
                System.out.println("Enter the identity card employee to edit: ");
                identityCard = scanner.nextLine();
            } while (!Regex.regexIdentityCard(identityCard));

            String phoneNumber;
            do {
                System.out.println("Enter the phone number employee to edit: ");
                phoneNumber = scanner.nextLine();
            } while (!Regex.regexPhoneNumber(phoneNumber));

            String email;
            do {
                System.out.println("Enter the email employee to edit: ");
                email = scanner.nextLine();
            } while (!Regex.regexEmail(email));

            String degree;
            do {
                System.out.println("Enter the degree employee to edit: "); //Trung Cap/Cao Dang/Dai Hoc/Sau Dai Hoc
                degree = scanner.nextLine();
            } while (!Regex.regexDegree(degree));

            String duty;
            do {
                System.out.println("Enter the duty employee to edit: "); //Le Tan/Phuc Vu/Chuyen Vien/Giam Sat/Quan Ly/Giam Doc
                duty = scanner.nextLine();
            } while (!Regex.regexDuty(duty));

            int salary = 0;
            do {
                try {
                    System.out.println("Enter the salary employee to edit: ");
                    salary = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException numberFormatException) {
                    System.out.printf("Number Format Exception");
                }
            } while (salary < 0);

            Employee employeeEdit = new Employee(employeeCode, name, date, identityCard, phoneNumber, email, degree, duty, salary);
            employeeRepository.edit(employeeCode, employeeEdit);
            System.out.println("COMPLETE EDIT EMPLOYEE CODE " + employeeCode);
        }


    }
}
