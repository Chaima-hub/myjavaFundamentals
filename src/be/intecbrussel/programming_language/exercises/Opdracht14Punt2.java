package be.intecbrussel.programming_language.exercises;

import java.util.Scanner;

public class Opdracht14Punt2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef uw gewicht in: ");
        double gewicht = keyboard.nextInt();

        System.out.println("geef uw lengte in (cm): ");
        double lengte = keyboard.nextInt();
        lengte /= 100;
        double bmi = gewicht / (lengte * lengte);

        if (bmi < 20) {
            System.out.println("BMI is laag");
        }
        else if (bmi >= 20 && bmi <25){
            System.out.println("ok");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("overgewicht");
        }
        else if (bmi >= 30 && bmi < 40) {
            System.out.println("obesitas");
        }
        else {
            System.out.println("ziekelijke overgewicht");
        }
    }
}
