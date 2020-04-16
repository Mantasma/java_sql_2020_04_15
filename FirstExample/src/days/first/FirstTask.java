package days.first;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        System.out.println("Iveskite zodi");
        Scanner sc = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = sc.nextLine();

            checkOrWordIsEvent(word);
            System.out.println("A raidziu zodyje yra:" + countLetters(word, 'a'));

        } while (!"pabaiga".equalsIgnoreCase(word));
    }

    private static void checkOrWordIsEvent(String word) {
        if (word.length() % 2 == 0) {
            System.out.println(String.format("Ivestas zodis %s yra lyginis", word));

        } else {System.out.println(String.format("Ivestas zodis %s yra nelyginis", word));
        }
    }
    private static int countLetters(String word, char letter){
        int count = 0;
        for(int i=0; i< word.length(); i++){
            if(letter == word.charAt(i)){
                count++;

            }
        }
        return count;
    }
}

