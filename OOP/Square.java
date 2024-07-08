package OOP;

public class Square extends Shapes{
    private int length;
    private Point lPoint;

    public Square(int length, Point lPoint) {
        this.length = length;
        this.lPoint = lPoint;
    }

    @Override
    public double square() {
        return length*length;
    }
}

