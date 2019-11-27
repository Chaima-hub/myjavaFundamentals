package be.intecbrussel.programming_language.demo;

import org.w3c.dom.ls.LSOutput;

public class ChoiceApp {

    public static void main(String[] args) {


        int temperature = 120;

        if (temperature > 30) {

            System.out.println("it is hot, turn on the airco please");
        } else if (temperature < 18) {
            System.out.println("it is cold, turn on the heater please");
        } else {
            System.out.println("this is a nice temperature");
        }

    }
    }

