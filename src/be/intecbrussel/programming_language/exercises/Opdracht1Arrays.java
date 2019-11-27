package be.intecbrussel.programming_language.exercises;

public class Opdracht1Arrays {

    public static void main(String[] args) {
        int [] numbers =  {7,14,21,28,35,42,49,56,63,70,77,84,91,98,105,112,119,126,133,140};

        int i = 0;

        for ( i = 0; i<numbers.length; i++ ) {
        System.out.println(numbers[i]);

    }

    int j = numbers.length-1;
        for ( i = 0; i<numbers.length; i++,j-- ) {
            System.out.println(numbers[j]);

        }

    }

}
