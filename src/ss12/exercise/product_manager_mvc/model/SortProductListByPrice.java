package ss12.exercise.product_manager_mvc.model;

import java.util.Comparator;

public class SortProductListByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
