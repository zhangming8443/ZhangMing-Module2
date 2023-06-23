package ss16.excercise.copy_file_test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class ReadAndWriteFile {
    public static void main(String[] args) {
        File fileSource = new File("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss16\\excercise\\copy_file_test\\source.txt");
        File fileTarget = new File("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss16\\excercise\\copy_file_test\\backup.txt");
        try {
            Files.copy(fileSource.toPath(), fileTarget.toPath());
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
