package be.intecbrussel.programming_language.ExtraOefeningen.sleepIn;

public class SleepIn {
    public static void main(String[] args) {

        boolean test = sleepIn(true, false);
        System.out.println(test);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        boolean result = false;

        if (weekday || vacation) {
            result= false;
        }
        return result;
    }
}