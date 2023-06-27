package ss17.excercise.product_manager_save_to_binary_files.util;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;
import ss17.excercise.product_manager_save_to_binary_files.repository.ProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void writeToFile(List<Product> productList) {
        ProductRepository productRepository = new ProductRepository();
        productList = productRepository.getProductList();
        try {
            FileWriter fileWriter = new FileWriter("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\excercise\\product_manager_save_to_binary_files\\data\\product.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : productList) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> readFromFile() {
        List<Product> productList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\excercise\\product_manager_save_to_binary_files\\data\\product.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String txt[] = line.split(";");
                int id = Integer.parseInt(txt[0]);
                String name = txt[1];
                int price = Integer.parseInt(txt[2]);
                String manufacturers = txt[3];
                String describe = txt[4];
                productList.add(new Product(id, name, price, manufacturers, describe));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
