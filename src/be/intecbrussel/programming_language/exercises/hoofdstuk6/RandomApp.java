package be.intecbrussel.programming_language.exercises.hoofdstuk6;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random rand = new Random(45);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;

        // Random rand2 = new Random(50);
        //int number7 = rand.nextInt(43);
        //int number8 = rand2.nextInt(43);
        //System.out.println(number7);
        //System.out.println(number8);

        number1 = rand.nextInt(43);
        number2 = rand.nextInt(43);
        number3 = rand.nextInt(43);
        number4 = rand.nextInt(43);
        number5 = rand.nextInt(43);
        number6 = rand.nextInt(43);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
    }

}
