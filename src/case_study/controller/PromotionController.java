package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public void displayPromotionMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flagPromotion = true;
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
                        flagPromotion = false;
                        break;
                    default:
                        System.out.println("ENTER AGAIN. PLEASE !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (flagPromotion);
    }
}
