package days.second;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();
        System.out.println("1. Staciojo trikampo plotas\n2. Staciakampio plotas\n3. Kvadrato plotas\n4. Apskritimo plotas\n5. Baigti");

        int selection = scanner.nextInt();

        switch(selection){
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
                System.exit(0);
                break;
            default:
                System.out.println("tokio veikmso nera");
        }
    }
    private void countTriangle(Scanner scanner){
        System.out.println("iveskite pirma statini");
        int a = scanner.nextInt();
        System.out.println("iveskite antra statini");
        int b = scanner.nextInt();

        System.out.println("trikampo plotas yra " + a * b / 2);

    }
    private void countRectangle(Scanner scanner){
        System.out.println("iveskite pirma staciakampio ilgi");
        int a = scanner.nextInt();
        System.out.println("iveskite antra staciakampo ploti");
        int b = scanner.nextInt();

        System.out.println("staciakampio plotas yra " + a * b);
    }
    private void countSquare(Scanner scanner){
        System.out.println("iveskite kvadrato ilgi");
        int a = scanner.nextInt();
        double z = Math.pow(a, 2);

        System.out.println("kvadrato plotas yra " + z);
    }
    private void countCircle(Scanner scanner){
        System.out.println("iveskite spindulio ilgi");
        int a = scanner.nextInt();
        double z = Math.pow(a, 2);

        System.out.println("apskritimo plotas yra " + z * 3.1415);
    }


}
