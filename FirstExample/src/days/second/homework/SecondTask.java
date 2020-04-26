package days.second.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

/* Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti,
tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius
kurie buvo didesni nei 100.*/
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite kiek ketinate ivesti skaiciu");

        int elementLenght = scanner.nextInt();

        int[] mas = new int[elementLenght]; //masyvas

        for(int i=0; i < mas.length; i++) {
            System.out.println(String.format("Iveskite %d elementa", i));
            mas[i] = scanner.nextInt();
        }
        for(int i = 0; i < mas.length; i++){
            if (mas[i] > 100){
                System.out.println(mas[i]);
            }
        }
    }
}
