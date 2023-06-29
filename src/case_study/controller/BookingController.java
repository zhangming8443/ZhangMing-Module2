package case_study.controller;

import java.util.Scanner;

public class BookingController {
    public void displayBookingMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flagBooking = true;
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
                        flagBooking = false;
                        break;
                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagBooking);
    }
}
