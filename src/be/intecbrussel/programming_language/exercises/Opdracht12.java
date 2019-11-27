package be.intecbrussel.programming_language.exercises;

public class Opdracht12 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = ++a * b-- + b < 2 ? --a : ++b;
        System.out.println(result);
    }
}
