package be.intecbrussel.programming_language.exercises;

import java.util.Scanner;

public class Opdracht2Hoofstuk7 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter your text");

        String text = kbd.nextLine();

        String [] words = text.split("-");

        for (String word: words) {
            System.out.println(word);
        }
    }
}