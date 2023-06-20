package ss12.exercise.product_manager_mvc.service;

import ss12.exercise.product_manager_mvc.model.Product;
import ss12.exercise.product_manager_mvc.repository.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final ProductRepo productRepo = new ProductRepo();

    @Override
    public void display() {
        List<Product> productList = productRepo.getProductList();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter the price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(id, nameProduct, price);
        productRepo.add(newProduct);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID to delete: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        List<Product> productList = productRepo.getProductList();
        boolean isCheckID = false;
        for (Product p : productList) {
            if (p.getId() == idDelete) {
                productList.remove(p);
                isCheckID = true;
                break;
            }
        }
        if (isCheckID) {
            System.out.println("Product ID " + idDelete + " removed !");
        } else {
            System.out.println("The id doesn't exist");

        }

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        display();
        System.out.println("Enter the ID to edit: ");
        int idStudentEdit = Integer.parseInt(scanner.nextLine());
        Product productEdit = null;
        List<Product> productList = productRepo.getProductList();
        for (Product p : productList) {
            if (p.getId() == idStudentEdit) {
                productEdit = p;
            }

        }
        if (productEdit != null) {
            System.out.println(productEdit);
            System.out.println("Enter the new name product: ");
            String name = scanner.nextLine();
            productEdit.setProductName(name);
            System.out.println("Enter the price: ");
            int price = Integer.parseInt(scanner.nextLine());
            productEdit.setPrice(price);
            productRepo.edit(productEdit);
        } else {
            System.out.println("The id doesn't exist ");
        }

    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID to check product");
        int id = Integer.parseInt(scanner.nextLine());
        productRepo.search(id);

    }

    @Override
    public void sort() {
        productRepo.sort();
    }
}
