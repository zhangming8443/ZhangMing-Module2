package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    public void displayFacilityMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flagFacility = true;

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
                        flagFacility = false;
                        break;
                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagFacility);
    }
}
