package ss17.excercise.product_manager_save_to_binary_files.util;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;

import java.util.Comparator;

public class SortProductsIncrementalPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
