package be.intecbrussel.programming_language.ExtraOefeningen.logo;

public class Circle {

    //properties

    public static final int ANGLES = 0; // als de naam ( bv ANGLES ) in hoofdletters is dan zetten we altijd final!!!!
    private static int count;
    private int x;
    private int y;
    private int radius;

    // constructors

    public Circle(){


    }

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle ( Circle c){

        this(c.radius,c.x,c.y);

    }

    //methods

    



}
