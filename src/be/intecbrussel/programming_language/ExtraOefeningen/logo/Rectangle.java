package be.intecbrussel.programming_language.ExtraOefeningen.logo;

import jdk.jfr.consumer.RecordedClass;

import javax.security.sasl.RealmChoiceCallback;

public class Rectangle {

    //properties

    private static int count;
    public static final int ANGLES = 4;
    private int x;
    private int y;
    private int width;
    private int height;

    // constructors

    public Rectangle(){
        this(0,0);
    }

    public  Rectangle(int width, int height){
    setHeight(height);
    setWidth(width);
    }

    public Rectangle(int width, int height, int x, int y){
        this.width = width;
        this.height = height;
        this.y = y;
        this.x = x;

    }

    public Rectangle (Rectangle r){
        this(r.width,r.height,r.x,r.y);
    }

    // methods

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getWidth (){
        return width;
    }
     public void setWidth(int width){
        this.width = width;
     }

     public int getHeight (){
        return height;
     }

     public void setHeight(int height){
        this.height = height;
     }

     public void setPosition(int x,int y){
        this.x = x;
        this.y = y;
     }

     public double getArea(){
        return height*width;
     }

     public double getPerimeter(){
        return (height  + width) * 2;     // height *2 + width *2
     }

     public void grow (int d){
     height = height + d;
     width = width + d;

     }

     public int getCount (){
        return count;
     }


}
