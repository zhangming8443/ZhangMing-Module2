package case_study.controller;

import case_study.service.class_service.EmployeeService;
import case_study.service.interface_service.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);

    public void displayEmployeeMenu() {
        IEmployeeService employeeService = new EmployeeService();
        boolean flagEmployee = true;
        do {
            try {
                System.out.println("-----EMPLOYEE MANAGEMENT-----"
                        + "\n1. Display list employees"
                        + "\n2. Add new employee"
                        + "\n3. Edit employee"
                        + "\n4. Return main menu");
                String chooseEmployee = scanner.nextLine();
                switch (chooseEmployee) {
                    case "1":
                        System.out.println("-----DIPSLAY LIST EMPLOYEES-----");
                        employeeService.display();
                        break;
                    case "2":
                        System.out.println("-----ADD NEW EMPLOYEE-----");
                        employeeService.add();
                        break;
                    case "3":
                        System.out.println("-----EDIT EMPLOYEES-----");
                        employeeService.editEmployee();
                        break;
                    case "4":
                        flagEmployee = false;
                        break;
                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagEmployee);
    }

}
