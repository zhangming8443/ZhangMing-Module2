package ss1.exercise;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị VND: " + quydoi);
        
    }
}