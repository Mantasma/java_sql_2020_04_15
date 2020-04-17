package days.second;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();
        int selection = 0;
        while (selection != 5) {
            System.out.println("1. Staciojo trikampo plotas\n2. Staciakampio plotas\n3. Kvadrato plotas\n4. Apskritimo plotas\n5. Baigti");

            selection = (int) NumberUtils.getCorrectNumber(scanner); // ima is kitos class, kito uzdavinio

            switch (selection) {
                case 1:
                    firstTask.countTriangle(scanner);
                    break;
                case 2:
                    firstTask.countRectangle(scanner);
                    break;
                case 3:
                    firstTask.countSquare(scanner);
                    break;
                case 4:
                    firstTask.countCircle(scanner);
                    break;
                case 5:
                    System.out.println("viso gero");//System.exit(0);
                    break;
                default:
                    System.out.println("tokio veikmso nera");
            }
        }
    }

    private void countTriangle(Scanner scanner) {
        System.out.println("iveskite pirma statini");
        double a = NumberUtils.getCorrectNumber(scanner);
        System.out.println("iveskite antra statini");
        double b = NumberUtils.getCorrectNumber(scanner);

        System.out.println("trikampo plotas yra " + a * b / 2);

    }

    private void countRectangle(Scanner scanner) {
        System.out.println("iveskite pirma staciakampio ilgi");
        double a = NumberUtils.getCorrectNumber(scanner);
        System.out.println("iveskite antra staciakampo ploti");
        double b = NumberUtils.getCorrectNumber(scanner);

        System.out.println("staciakampio plotas yra " + a * b);
    }

    private void countSquare(Scanner scanner) {
        System.out.println("iveskite kvadrato ilgi");
        double a = NumberUtils.getCorrectNumber(scanner);
        double z = Math.pow(a, 2);

        System.out.println("kvadrato plotas yra " + z);
    }

    private void countCircle(Scanner scanner) {
        System.out.println("iveskite spindulio ilgi");
        double a = NumberUtils.getCorrectNumber(scanner);
        DecimalFormat df = new DecimalFormat("0.00");
        double z = Math.pow(a, 2);
        double pi = 3.1415;

        System.out.println("apskritimo plotas yra " + df.format( z * pi)); // butinai df.format
    }


}
