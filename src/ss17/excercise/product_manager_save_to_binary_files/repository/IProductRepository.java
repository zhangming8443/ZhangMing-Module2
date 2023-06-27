package ss17.excercise.product_manager_save_to_binary_files.repository;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();
    void addNewProduct(Product product);
    void searchProduct(int id);
    void deleteProduct(Product product);
    void editProduct(Product product);
    void sortListProduct();

}
