package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public void displayCustomerMenu() {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        boolean flagCustomer = true;
        do {
            try {
                System.out.println("-----CUSTOMER MANAGEMENT-----"
                        + "\n1. Display list customers"
                        + "\n2. Add new customer"
                        + "\n3. Edit customer"
                        + "\n4. Return main menu");
                String chooseCustomer = scanner.nextLine();
                switch (chooseCustomer) {
                    case "1":
                        System.out.println("-----DIPSLAY LIST CUSTOMERS-----");
                        customerService.display();
                        break;
                    case "2":
                        System.out.println("-----ADD NEW CUSTOMER-----");
                        customerService.add();
                        break;
                    case "3":
                        System.out.println("-----EDIT CUSTOMER-----");
                        customerService.editCustomer();
                        break;
                    case "4":
                        flagCustomer = false;
                        break;
                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagCustomer);
    }
}
