package be.intecbrussel.programming_language.KlasseDefineren;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        rect.height = 5;
        rect.width = 10;
        rect.x = 1;
        rect.y = 2;
        System.out.println(rect.height);
        System.out.println(rect.width);
        System.out.println(rect);

        Rectangle rect2 = new Rectangle();
        rect2.height = 4;
        rect2.width = 12;
        rect2.x = 2;
        rect2.y = 3;
        System.out.println(rect2.height);
        System.out.println(rect2.width);
        System.out.println(rect2.x);
        System.out.println(rect2.y);
        System.out.println(rect2);
    }
}
