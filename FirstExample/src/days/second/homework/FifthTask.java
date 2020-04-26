package days.second.homework;

import java.util.Scanner;
/*
* Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.  Po to kai bus įvesti
* visi žodžiai, jie turi būti atvaizduojami.
* */
public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius");

        String[] mas = new String[5];
        for(int i = 0; i < mas.length; i++) {
            System.out.println(String.format("Iveskite %d zodi", i + 1));
            mas[i] = scanner.nextLine();
        }

        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
