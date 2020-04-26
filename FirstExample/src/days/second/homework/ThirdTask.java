package days.second.homework;

import days.second.NumberUtils;

import java.util.Scanner;

/*
* Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje turi būti
*  atvaizduojama įvestų skaičių suma. Skaičiavimas turi būti atliekamas kitame metode. Papildykite programą
* kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas
 skaičius. */
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skaiciuositi ivestu skaiciu suma, 0 baigti");
        int number = 1, sum = 0;

        while(number != 0) {
            number = (int) NumberUtils.getCorrectNumber(scanner);
            sum = sum(sum, number);
        }

        System.out.println("Ivestu skaiciu suma yra " + sum);
    }

    private static int sum(int sum, int newNumber) {
        return sum + newNumber;
    }
}
