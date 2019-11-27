package be.intecbrussel.programming_language.ExtraOefeningen.gokken;

import java.util.Random;
import java.util.Scanner;

public class GokkenApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int random = rand.nextInt(10);
        Gokken gok = new Gokken();


        System.out.println("Gok 1: ");
        int gok1= scan.nextInt();

        System.out.println("Gok 2: ");
        int gok2= scan.nextInt();

        System.out.println("Gok 3: ");
        int gok3 = scan.nextInt();

        System.out.println("Gok 4: ");
        int gok4 = scan.nextInt();

        System.out.println("Gok 5: ");
        int gok5 = scan.nextInt();


        System.out.println(gok.getGok());








        System.out.println("Getallen gebruiker: ");

        System.out.println("Getallen Computer: ");



    }
}
