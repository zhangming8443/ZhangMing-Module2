package ss12.exercise.product_manager_mvc.controller;

import ss12.exercise.product_manager_mvc.model.Product;
import ss12.exercise.product_manager_mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("CHOICE FUNCTION : "
                    + "\n1.Display"
                    + "\n2.Add"
                    + "\n3.Delete"
                    + "\n4.Edit"
                    + "\n5.Sort Price Ascending"
                    + "\n6.Sort Price Descending"
                    + "\n7.Exit");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("---DISPLAY---");
                    productService.display();
                    break;
                case "2":
                    System.out.println("---ADD---");
                    productService.add();
                    break;
                case "3":
                    System.out.println("---DELETE---");
                    productService.delete();
                    break;
                case "4":
                    System.out.println("---EDIT---");
                    productService.edit();
                    break;
                case "5":
                    System.out.println("---PRICE ASCENDING---");
                    productService.sortPriceAscending();
                    break;
                case "6":
                    System.out.println("---PRICE DESCENDING---");
                    productService.sortPriceDescending();
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("Enter again !");
            }
        }
        while (flag);
    }
}
