package case_study.controller;

import case_study.service.interface_service.IFacilityService;
import case_study.service.class_service.FacilityService;

import java.util.Scanner;

public class AddFacilityController {
    public void displayAddNewFacility() {
        Scanner scanner = new Scanner(System.in);
        IFacilityService facilityService = new FacilityService();
        boolean flagAddNew = true;

        do {
            try {
                System.out.println("1. Add new Villa"
                        + "\n2. Add new House"
                        + "\n3. Add new Room"
                        + "\n4. Back to menu");
                String chooseAddNew = scanner.nextLine();
                switch (chooseAddNew) {
                    case "1":
                        System.out.println("-----ADD NEW VILLA-----");
                        facilityService.addVilla();
                        break;
                    case "2":
                        System.out.println("-----ADD NEW HOUSE-----");
                        facilityService.addHouse();
                        break;
                    case "3":
                        System.out.println("-----ADD NEW ROOM-----");
                        facilityService.add();
                        break;
                    case "4":
                        flagAddNew = false;
                        break;
                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagAddNew);
    }
}
