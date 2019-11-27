package be.intecbrussel.programming_language.ExtraOefeningen.gokken;

import java.util.Random;
import java.util.Scanner;

public class Gokken {
    //properties
    private int [] gok;
    private int [] gokComputer;
    private boolean guessed = false;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int random = rand.nextInt(10);

    //constructor

    // methods

    public int[] getGok() {
        return gok;
    }


    public void setGok(int[] gok) {
        this.gok = gok;
        while (!guessed) {
            int guess = scan.nextInt();
            if (guess < random) {
                System.out.println("hoger");
            } else if (guess > random) {
                System.out.println("lager");
            } else {
                System.out.println("gevonden");
                guessed = true;
            }
        }
        scan.close();

    }

    }



