package OOP;

import javax.crypto.spec.PSource;

public class Start {
    public static void main(String[] args) {
        var square = new Square(10, new Point(1, 1));
        var circle = new Circle(new Point(1,1), 10);
        var rectengle = new Rectangle(10, 10, new Point(1, 1));
        System.out.println(square.square());
        System.out.println(circle.square());
        System.out.println(rectengle.square());
    }
    public static double areaForAllFigures(Shapes... shapes) {
        double sum=0;
        for (Shapes shape : shapes) {
            sum+=shape.square();
        }
        return sum;
    }
}
