package be.intecbrussel.programming_language.demo;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        //
        Scanner keyboard = new Scanner(System.in);
        var rand = new Random();
        var numberToGuess = rand.nextInt(100);
        System.out.println("Enter a number:");

        boolean guessed = false;
         while (! guessed) {
            int guess = keyboard.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher!");
            }
                else if (guess > numberToGuess) {
                System.out.println("Lower");
            }
                else{
                    System.out.println("you got it");
                    guessed = true;
                }
                }
        System.out.println("end of program");
    }
    }