package case_study.controller;

import case_study.service.class_service.FacilityService;
import case_study.service.interface_service.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    AddFacilityController newFacilityController = new AddFacilityController();
    IFacilityService facilityService = new FacilityService();
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
                        facilityService.display();
                        break;
                    case "2":
                        System.out.println("-----ADD NEW FACILITY-----");
                        newFacilityController.displayAddNewFacility();
                        break;
                    case "3":
                        System.out.println("-----DIPSLAY LIST FACILITY MAINTENANCE-----");
                        facilityService.displayListFacilityMaintenance();
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
