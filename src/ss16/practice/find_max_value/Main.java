package ss16.practice.find_max_value;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss16\\practice\\sum_numbers_fie_test\\numbers.txt");
        int maxValue = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss16\\practice\\find_max_value\\result.txt", maxValue);
    }

}
