package be.intecbrussel.programming_language.demo.Age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = 0;
        age = keyboard.nextInt();

        while (age <=0) {
            System.out.println("Please enter a age above 0");
            age = keyboard.nextInt();
        }
        if (age >= 18)
            System.out.println("you are an adult");
        else
            System.out.println("you are a child");
    }
}
