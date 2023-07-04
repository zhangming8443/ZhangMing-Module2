package case_study.service.class_service;

import case_study.model.person.Employee;
import case_study.repository.class_repository.EmployeeRepository;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.service.interface_service.IEmployeeService;
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
        int index;
        String employeeCode;
        do {
            employeeCode = Regex.checkEmployeeCode();
            index = employeeRepository.checkEmployeeCodeExist(employeeCode);
            if (index == 1) {
                System.out.println("Employee code is exist !");
            }
        }
        while (index == 1);
        String name = Regex.checkName();
        String date = Regex.checkDate();
        String identityCard = Regex.checkIdentityCard();
        String phoneNumber = Regex.checkPhoneNumber();
        String email = Regex.checkEmail();
        String degree = Regex.choiceDegree();
        String duty = Regex.choiceDuty();
        int salary = Regex.checkSalary();
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
            String name = Regex.checkName();
            String date = Regex.checkDate();
            String identityCard = Regex.checkIdentityCard();
            String phoneNumber = Regex.checkPhoneNumber();
            String email = Regex.checkEmail();
            String degree = Regex.choiceDuty();
            String duty = Regex.choiceDuty();
            int salary = Regex.checkSalary();
            Employee employeeEdit = new Employee(employeeCode, name, date, identityCard, phoneNumber, email, degree, duty, salary);
            employeeRepository.edit(employeeCode, employeeEdit);
            System.out.println("COMPLETE EDIT EMPLOYEE CODE " + employeeCode);
        }


    }
}
