package be.intecbrussel.programming_language.ExtraOefeningen.booleanJava;

public class Boolean {

    public static void main(String[] args) {

        boolean passedDoor = true;
        boolean missedDoor = false;
        int doorCount = 0;
        boolean passedAllDoors = false;

        if (passedDoor) {
            System.out.println("We passed the first door!");
            doorCount = doorCount + 1;
        }
        if (passedDoor) {
            System.out.println("We passed the second door!");
            doorCount = doorCount + 1;
        }
        if (passedDoor) {
            System.out.println("We passed the third door!");
            doorCount = doorCount +1;
        }
        if  (doorCount == 3){
            passedAllDoors = true;
        }

        if (passedAllDoors){
            System.out.println("Congratulations you won the program!");
        }

    }
}
