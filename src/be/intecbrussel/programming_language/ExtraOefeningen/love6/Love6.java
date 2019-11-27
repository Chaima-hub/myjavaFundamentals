package be.intecbrussel.programming_language.ExtraOefeningen.love6;

public class Love6 {
    public static void main(String[] args) {
        boolean test= love6(-6,2);
        System.out.println(test);
    }
    public static boolean love6(int a, int b){
        boolean result = false;

        int som = a + b;
        int diff = a - b;

        if ((a==6 || b == 6 ) || (som==6 || Math.abs(diff) ==6)){
            result= true;
        }

        else {
            result = false;
        }
        return result;
    }

}