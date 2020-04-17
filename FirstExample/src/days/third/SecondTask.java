package days.third;

import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Antanas nusprendė nusipirkti naują automobilį ir jam svarbus rodiklis yra kuro sąnaudos.
Padėkite Antanui ir realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai
sunaudoja kuro 100 km. Programa turi paprašyti Antano įvesti nuvažiuotus km ir kuro sąnaudas.
 Formulė vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo. Vidurkio skaičiavimas vykdomas
 kitame metode. Programa negali sustoti jei Antanas per klaidą įves tekstą, ji tu vėl prašyti
 pakartoti įvedimą. Programa baigia darbą kai vidurkis apskaičiuotas sėkmingai.
 */
public class SecondTask {
    private double distance;
    private double fuelconsumption;

    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        secondTask.readRequiredUserData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        System.out.println("Jusu Kuro sanaudos " + decimalFormat.format(secondTask.countFuel()));

    }
    private void readRequiredUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km.");
        distance = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite kuro sanaudas");
        fuelconsumption = NumberUtils.getCorrectNumber(scanner);
    }
    private double countFuel(){
        return (fuelconsumption * 100) / distance;
    }
}
