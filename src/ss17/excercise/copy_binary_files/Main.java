package ss17.excercise.copy_binary_files;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String SOURCE_PATH_FILE = "E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\excercise\\copy_binary_files\\source.dat";
    private static String TARGET_PATH_FILE = "E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\excercise\\copy_binary_files\\target.dat";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello World!");
        ReadAndWriteFileBinary.writeBinaryFile(SOURCE_PATH_FILE, list);
        List<String> newList = ReadAndWriteFileBinary.readBinaryFile(SOURCE_PATH_FILE);
        ReadAndWriteFileBinary.writeBinaryFile(TARGET_PATH_FILE, list);
        for (String str : newList) {
            System.out.println(str);
        }
    }
}
