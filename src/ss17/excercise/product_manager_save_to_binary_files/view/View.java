package ss17.excercise.product_manager_save_to_binary_files.view;

import ss17.excercise.product_manager_save_to_binary_files.controller.ProductController;

public class View {
    public static void main(String[] args){
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}