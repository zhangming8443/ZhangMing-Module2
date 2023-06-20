package ss12.exercise.product_manager_mvc.repository;

import ss12.exercise.product_manager_mvc.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {
    List<Product> getProductList();

    void add(Product product);

    void delete(Product product);

    void edit(Product product);

    void search(int id);
    void sort();

}
