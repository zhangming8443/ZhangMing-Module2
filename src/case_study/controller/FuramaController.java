package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flagMenu = true;
        boolean flagEmployee = true;
        boolean flagCustomer = true;
        boolean flagFacility = true;
        boolean flagBooking = true;
        boolean flagPromotion = true;
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

                                        break;
                                    case "2":
                                        System.out.println("-----ADD NEW EMPLOYEE-----");

                                        break;
                                    case "3":
                                        System.out.println("-----EDIT EMPLOYEES-----");

                                        break;
                                    case "4":
                                        continue OUTER_WHILE_LOOP;
                                    default:
                                        System.out.println("ENTER AGAIN. PLEASE !");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        while (flagEmployee);
                        break;

                    case "2":
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

                                        break;
                                    case "2":
                                        System.out.println("-----ADD NEW CUSTOMER-----");

                                        break;
                                    case "3":
                                        System.out.println("-----EDIT CUSTOMER-----");

                                        break;
                                    case "4":
                                        continue OUTER_WHILE_LOOP;
                                    default:
                                        System.out.println("ENTER AGAIN. PLEASE !");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        while (flagCustomer);
                        break;

                    case "3":
                        do {
                            try {
                                System.out.println("-----FACILITY MANAGEMENT-----"
                                        + "\n1. Display list facility"
                                        + "\n2. Add new facility"
                                        + "\n3. Display list facility maintenance"
                                        + "\n4. Return main menu");
                                String chooseFacility = scanner.nextLine();
                                switch (chooseFacility) {
                                    case "1":
                                        System.out.println("-----DIPSLAY LIST FACILITY-----");

                                        break;
                                    case "2":
                                        System.out.println("-----ADD NEW FACILITY-----");

                                        break;
                                    case "3":
                                        System.out.println("-----DIPSLAY LIST FACILITY MAINTENANCE-----");

                                        break;
                                    case "4":
                                        continue OUTER_WHILE_LOOP;
                                    default:
                                        System.out.println("ENTER AGAIN. PLEASE !");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        while (flagFacility);
                        break;

                    case "4":
                        do {
                            try {
                                System.out.println("-----BOOKING MANAGEMENT-----"
                                        + "\n1. Add new booking"
                                        + "\n2. Display list booking"
                                        + "\n3. Create new contracts"
                                        + "\n4. Display list contracts"
                                        + "\n5. Edit contracts"
                                        + "\n6. Return main menu");
                                String chooseBooking = scanner.nextLine();
                                switch (chooseBooking) {
                                    case "1":
                                        System.out.println("-----ADD NEW BOOKING-----");

                                        break;
                                    case "2":
                                        System.out.println("-----DISPLAY LIST BOOKING-----");

                                        break;
                                    case "3":
                                        System.out.println("-----CREATE NEW CONTRACTS-----");

                                        break;
                                    case "4":
                                        System.out.println("-----DISPLAY LIST CONTRACTS-----");

                                        break;
                                    case "5":
                                        System.out.println("-----EDIT CONTRACTS-----");

                                        break;
                                    case "6":
                                        continue OUTER_WHILE_LOOP;
                                    default:
                                        System.out.println("ENTER AGAIN. PLEASE !");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        while (flagBooking);
                        break;

                    case "5":
                        do {
                            try {
                                System.out.println("-----PROMOTION MANAGEMENT-----"
                                        + "\n1. Display list customers use service"
                                        + "\n2. Display list customers get voucher"
                                        + "\n3. Return main menu");
                                String choosePromotion = scanner.nextLine();
                                switch (choosePromotion) {
                                    case "1":
                                        System.out.println("-----DIPSLAY LIST CUSTOMERS USE SERVICE-----");

                                        break;
                                    case "2":
                                        System.out.println("-----DISPLAY LIST CUSTOMERS GET VOUCHER-----");

                                        break;
                                    case "3":
                                        continue OUTER_WHILE_LOOP;
                                    default:
                                        System.out.println("ENTER AGAIN. PLEASE !");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        while (flagPromotion);
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

