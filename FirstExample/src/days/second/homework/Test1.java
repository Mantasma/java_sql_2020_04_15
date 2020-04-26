package days.second.homework;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir veiksma tarp ju pvz 2 + 2");

        String line = scanner .nextLine();
        String[] items = line.split(" ");

        int firstNumber = (int) NumberUtilss.getCorrectNumber(scanner, items[0]);
        int secondNumber = (int) NumberUtilss.getCorrectNumber(scanner, items[2]);

        requiredAction(items[1],firstNumber,secondNumber, scanner);
    }
    private static void requiredAction(String action, int firstNumber, int secondNumber, Scanner scanner) {
        switch (action) {
            case "+":
                System.out.println("Rezultatas yra " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Rezultatas yra " + (firstNumber - secondNumber));
                break;
            default:
                System.out.println("Tokio veiksmo nera");
                break;
        }
    }
}
