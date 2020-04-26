package days.second.homework;

import java.util.Scanner;

/*
* Parašyti programą funkcijos f(x) reikšmei surasti:
a.        jei x teigiamas, tai f(x)=2x+8,
b.      jei x neteigiamas, tai f(x)=21-7x

* */
public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println("Teigiamo skaiciaus rezultatas " + (2 * number + 8));
        }else {
            System.out.println("Neigiamo skaiciaus rezultatas " + (21 - 7 * number));
        }
    }
}
