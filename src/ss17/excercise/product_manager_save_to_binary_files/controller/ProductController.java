package ss17.excercise.product_manager_save_to_binary_files.controller;

import ss17.excercise.product_manager_save_to_binary_files.service.IProductService;
import ss17.excercise.product_manager_save_to_binary_files.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService productService = new ProductService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---PRODUCT MANAGEMENT---"
                    + "\n1. Display product list"
                    + "\n2. Add new product"
                    + "\n3. Search product"
                    + "\n4. Delete product"
                    + "\n5. Edit product"
                    + "\n6. Sort list product"
                    + "\n7. Exit");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("---PRODUCT LIST---");
                    productService.displayProduct();
                    break;
                case "2":
                    System.out.println("---ADD NEW PRODUCT---");
                    productService.addNewProduct();
                    break;
                case "3":
                    System.out.println("---SEARCH PRODUCT---");
                    productService.searchProduct();
                    break;
                case "4":
                    System.out.println("---DELETE PRODUCT---");
                    productService.deleteProduct();
                    break;
                case "5":
                    System.out.println("---EDIT PRODUCT---");
                    productService.editProduct();
                    break;
                case "6":
                    System.out.println("---SORT PRODUCTS INCREMENTAL PRICE---");
                    productService.sortListProduct();
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("ENTER AGAIN, PLEASE !");
            }
        }
        while (true);

    }
}
