package bai1;

import bai1.Circle;
import bai1.Rectangle;
import bai1.Shape;
import bai1.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(3.5);
        shapes[1]=new Rectangle(2.5,4);
        shapes[2]=new Square(3);
        System.out.println("-----ban dau-------");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
        System.out.println("------sau thay doi---------");
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(1);
            System.out.println(shapes[i]);
        }
    }
}