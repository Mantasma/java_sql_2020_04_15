package days.second.homework;

import java.util.Scanner;
/*
*Parašyti metodą kuris suskaičiuoja kiek per parametrus paduotame žodyje yra raidžių “a”.
* pabaiga Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0.

 * */
public class TenTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite zodi");
        int count = countLetters(sc.nextLine(), 'b');

        System.out.println("Rasta raidziu zodyje " + count);
    }

    private static int countLetters(String word, char letter) {
        if(word == null || word.length() == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(letter == word.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
