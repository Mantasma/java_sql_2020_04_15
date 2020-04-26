package days.second.homework;

import java.util.Scanner;
/*Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to parašytų ar
šis skaičius yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.

  */
public class first {
    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(String.format("Skaicius %d yra lyginis", number));
        }
        else{
            System.out.println(String.format("Skaicius %d yra nelyginis", number));

        }

    }
}
