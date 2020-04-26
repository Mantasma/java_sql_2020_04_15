package days.second.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtilss {
    public static double getCorrectNumber(Scanner scanner) {
        while (true) {
            try {
                double number = scanner.nextDouble();
                return number;
            } catch (InputMismatchException ex) {
                System.out.println("Ivedete bloga skaiciu pakartokite");
                scanner.nextLine();
            }
        }
    }
    public  static  double getCorrectNumber(Scanner scanner, String number){
        try {
            return Integer.parseInt(number);
        }catch (NumberFormatException e){
            System.out.println("ivedete bloga skaiciu, teks pakartoti");
            return getCorrectNumber(scanner);
        }
    }
}
