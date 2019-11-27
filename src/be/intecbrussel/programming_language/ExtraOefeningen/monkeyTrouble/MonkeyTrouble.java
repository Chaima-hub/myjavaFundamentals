package be.intecbrussel.programming_language.ExtraOefeningen.monkeyTrouble;

public class MonkeyTrouble {
    public static void main(String[] args) {

        boolean test = monkeyTrouble(true ,false);
        System.out.println(test);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        boolean result = false;

        if (aSmile == bSmile ){
            return true;
        }
        return result;
    }
}
