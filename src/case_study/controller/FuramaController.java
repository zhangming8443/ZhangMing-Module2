package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    FacilityController facilityController = new FacilityController();
    BookingController bookingController = new BookingController();
    PromotionController promotionController = new PromotionController();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flagMenu = true;
        OUTER_WHILE_LOOP:
        do {
            try {
                System.out.println("-----FURAMA MANAGEMENT-----"
                        + "\n1. Employee Management"
                        + "\n2. Customer Management"
                        + "\n3. Facility Management"
                        + "\n4. Booking Management"
                        + "\n5. Promotion Management"
                        + "\n6. Exit");
                String chooseMenu = scanner.nextLine();
                switch (chooseMenu) {
                    case "1":
                        employeeController.displayEmployeeMenu();
                        break;

                    case "2":
                        customerController.displayCustomerMenu();
                        break;

                    case "3":
                        facilityController.displayFacilityMenu();
                        break;

                    case "4":
                        bookingController.displayBookingMenu();
                        break;

                    case "5":
                        promotionController.displayPromotionMenu();
                        break;

                    case "6":
                        System.exit(0);

                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagMenu);
    }
}

