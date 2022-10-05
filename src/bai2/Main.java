package bai2;

import bai2.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
            if (shapes[i] instanceof Square) {
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
