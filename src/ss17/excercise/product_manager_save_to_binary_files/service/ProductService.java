package ss17.excercise.product_manager_save_to_binary_files.service;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;
import ss17.excercise.product_manager_save_to_binary_files.repository.IProductRepository;
import ss17.excercise.product_manager_save_to_binary_files.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final IProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayProduct() {
        List<Product> productList = productRepository.getProductList();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addNewProduct() {
        System.out.println("Enter the ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the product name: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter the product price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the manufacturers: ");
        String manufactures = scanner.nextLine();
        System.out.println("Enter the describe: ");
        String describe = scanner.nextLine();
        Product newProduct = new Product(id, nameProduct, price, manufactures, describe);
        productRepository.addNewProduct(newProduct);
    }

    @Override
    public void searchProduct() {
        System.out.println("Enter the product ID to search: ");
        int idSearch = Integer.parseInt(scanner.nextLine());
        productRepository.searchProduct(idSearch);
    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter the ID to delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        List<Product> productList = productRepository.getProductList();
        boolean isCheckID = false;
        for (Product p : productList) {
            if (p.getIdProduct() == idDelete) {
                productRepository.deleteProduct(p);
                isCheckID = true;
                break;
            }
        }
        if (isCheckID) {
            System.out.println("Product ID " + idDelete + " removed !");
        } else {
            System.out.println("ID don't exist");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Enter the ID to edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        Product productEdit = null;
        List<Product> productList = productRepository.getProductList();
        for (Product p : productList) {
            if (p.getIdProduct() == idEdit) {
                productEdit = p;
            }
        }
        if (productEdit != null) {
            System.out.println(productEdit);
            System.out.println("Enter the name edit: ");
            String nameProductEdit = scanner.nextLine();
            productEdit.setNameProduct(nameProductEdit);
            System.out.println("Enter the price edit: ");
            int priceEdit = Integer.parseInt(scanner.nextLine());
            productEdit.setPrice(priceEdit);
            System.out.println("Enter the manufactures edit: ");
            String manufacturesEdit = scanner.nextLine();
            productEdit.setManufacturers(manufacturesEdit);
            System.out.println("Enter the describe edit");
            String describeEdit = scanner.nextLine();
            productEdit.setDescribe(describeEdit);
        }


    }

    @Override
    public void sortListProduct() {
        productRepository.sortListProduct();
    }
}
