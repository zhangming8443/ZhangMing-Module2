package ss12.exercise.product_manager_mvc.repository;

import ss12.exercise.product_manager_mvc.model.Product;
import ss12.exercise.product_manager_mvc.model.SortProductListByPrice;

import java.util.*;

public class ProductRepo implements IProductRepo {
    private static List<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Iphone", 500);
        Product product2 = new Product(3, "Samsung", 400);
        Product product3 = new Product(2, "Nokie", 100);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
    }

    @Override
    public void edit(Product product) {
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                p = product;
            }
        }
    }

    @Override
    public void search(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (Objects.equals(id, productList.get(i).getId())) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(productList, new SortProductListByPrice());
        for (Product p : productList) {
            System.out.println(p);
        }

    }

}
