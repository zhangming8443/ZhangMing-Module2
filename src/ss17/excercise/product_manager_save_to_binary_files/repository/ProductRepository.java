package ss17.excercise.product_manager_save_to_binary_files.repository;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;
import ss17.excercise.product_manager_save_to_binary_files.util.SortProductsIncrementalPrice;
import ss17.excercise.product_manager_save_to_binary_files.util.ReadAndWriteFile;
import ss17.excercise.product_manager_save_to_binary_files.util.ReadAndWriteFileBinary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList<>();
    private final String PRODUCT_PATH_BINARY_FILE = "E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\excercise\\product_manager_save_to_binary_files\\data\\product.dat";
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//
//    static {
//        Product product1 = new Product(1, "IPHONE 14 PRO MAX", 5000, "Apple", "Telephone");
//        Product product2 = new Product(2, "SAMSUNG Z FOLD 4", 4900, "Samsung", "Telephone");
//        Product product3 = new Product(3, "JBL FLIP 6", 2000, "JBL", "Bluetooth speaker");
//        Product product4 = new Product(4, "MX MASTER 3S", 2000, "Logitech", "Wireless mouse");
//        Product product5 = new Product(5, "POP KEYS", 2000, "Logitech", "Key board");
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//        productList.add(product4);
//        productList.add(product5);
//        readAndWriteFile.writeToFile(productList);
//        readAndWriteFile.readFromFile();
//    }

    @Override
    public ArrayList<Product> getProductList() {
        productList = (ArrayList<Product>) ReadAndWriteFileBinary.readBinaryFile(PRODUCT_PATH_BINARY_FILE);
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        productList = (ArrayList<Product>) ReadAndWriteFileBinary.readBinaryFile(PRODUCT_PATH_BINARY_FILE);
        productList.add(product);
        ReadAndWriteFileBinary.writeBinaryFile(PRODUCT_PATH_BINARY_FILE, productList);
    }

    @Override
    public void searchProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (Objects.equals(id, productList.get(i).getIdProduct())) {
                System.out.println(productList.get(i));
            }
        }

    }

    @Override
    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public void editProduct(Product product) {
        for (Product p : productList) {
            if (p.getIdProduct() == product.getIdProduct()) {
                p = product;
            }
        }

    }

    @Override
    public void sortListProduct() {
        Collections.sort(productList, new SortProductsIncrementalPrice());
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
