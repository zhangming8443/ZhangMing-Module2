package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;
import case_study.utils.Regex;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter the employee code employee: ");
        String employeeCode = scanner.nextLine();
        String name;
        do {
            System.out.println("Enter the name employee: ");
           name = scanner.nextLine();
        }while(!Regex.regexName(name));
        System.out.println("Enter the date employee: ");
        String date = scanner.nextLine();
        System.out.println("Enter the identity card employee: ");
        String identity = scanner.nextLine();
        System.out.println("Enter the phone number employee: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email employee: ");
        String email = scanner.nextLine();
        System.out.println("Enter the degree employee: ");
        String degree = scanner.nextLine();
        System.out.println("Enter the duty employee: ");
        String duty = scanner.nextLine();
        System.out.println("Enter the salary employee: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(employeeCode, name, date, identity, phoneNumber, email, degree, duty, salary);
        employeeRepository.addNew(employee);
        System.out.println("Complete add new employee !");
    }

    @Override
    public void editEmployee() {
        System.out.println("Enter the employee to edit: ");
        String employeeCodeEdit = scanner.nextLine();
        Employee employee = employeeRepository.getByEmployeeCode(employeeCodeEdit);
        if (employee == null) {
            System.out.println("Not found id");
        } else {
            System.out.println(employee);
            System.out.println("Edit employee by code " + employeeCodeEdit);
            System.out.println("Enter the name employee: ");
            String name = scanner.nextLine();
            System.out.println("Enter the date employee: ");
            String date = scanner.nextLine();
            System.out.println("Enter the identity card employee: ");
            String identity = scanner.nextLine();
            System.out.println("Enter the phone number employee: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter the email employee: ");
            String email = scanner.nextLine();
            System.out.println("Enter the degree employee: ");
            String degree = scanner.nextLine();
            System.out.println("Enter the duty employee: ");
            String duty = scanner.nextLine();
            System.out.println("Enter the salary employee: ");
            int salary = Integer.parseInt(scanner.nextLine());
            Employee employee1 = new Employee(employeeCodeEdit, name, date, identity, phoneNumber, email, degree, duty, salary);
            employeeRepository.edit(employeeCodeEdit, employee1);
        }


    }
}
