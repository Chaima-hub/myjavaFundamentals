package be.intecbrussel.programming_language.exercises;

import java.util.Scanner;

public class Opdracht14 {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter your age:");
        var age = keyboard.nextInt();

        if (age<=2) {
            System.out.println("Je bent een baby");
        }

        else if (age<=10) {
            System.out.println("Je bent een kind");
        }

        else if (age <=17){
            System.out.println("Je bent een tiener");
            }

        else {
            System.out.println("U bent een volwassene");
        }
    }
}
