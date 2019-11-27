package be.intecbrussel.programming_language.exercises;

import java.util.Scanner;

public class TijdsmetingAppDeel1 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println( "Geef uw startuur in:");
        var startuur = Keyboard.nextInt();
        System.out.println("Geef uw aantal startminuten in:");
        System.out.println( "Geef uw einduur in:");
        var einduur = Keyboard.nextInt();
        System.out.println("Geef uw aantal eindminuten in:");

       // int startuur: (startuur - einduur)
    }
}
