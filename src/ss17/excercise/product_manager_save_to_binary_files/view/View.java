package ss17.excercise.product_manager_save_to_binary_files.view;

import ss17.excercise.product_manager_save_to_binary_files.controller.ProductController;
import ss17.excercise.product_manager_save_to_binary_files.model.Product;
import ss17.excercise.product_manager_save_to_binary_files.reposirity.ProductRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class View {
    public static void main(String[] args){
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}