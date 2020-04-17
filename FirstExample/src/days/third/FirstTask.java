package days.third;
/*Parašyti programą, kuri padėtu Jonukui apsiskaičiuoti savo kūno masės indeksą. Jonukas turi įvesti savo masę
ir ūgį, pagal gautus duomenis paskaičiuotų ir atvaizduotų jo kūno masės indeksą. KMI = masė (kg) / (ūgis(m))^2.
Jonuko duomenų nuskaitymas ir skaičiavimas vykdomi skirtinguose metoduose. Papildykite programa, kad jei Jonukas
įvestu ne skaičių programa pasakytu, kad blogai įvestas skaičius ir leistu pakartoti. Programa baigtu darbą tik tada
 kai abu skaičiai įvesti gerai ir kmi apskaičiuotas.
 */

import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstTask {
    private double height;
    private double weight;

    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        firstTask.readRequiredUserData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        System.out.println("Jusu KMI " + decimalFormat.format(firstTask.countKmi()));

    }
    private void readRequiredUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo ugi");
        height = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite savo svori kg");
        weight = NumberUtils.getCorrectNumber(scanner);
    }
    private double countKmi(){
        return weight / Math.pow(height, 2);
    }
}
