package ss17.excercise.copy_binary_files;

import ss17.excercise.product_manager_save_to_binary_files.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileBinary {
    public static void writeBinaryFile(String pathFile, List<String> productList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readBinaryFile(String pathFile) {
        List<String > list = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0){
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<String>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found !");
        }
        return list;
    }
}
