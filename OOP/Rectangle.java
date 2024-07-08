package OOP;

public class Rectangle extends Shapes {
    private int length, width;
    private Point lPonit;

    public Rectangle(int length, int width, Point lPonit) {
        this.length = length;
        this.width = width;
        this.lPonit = lPonit;
    }

    @Override
    public double square() {
        return width*length;
    }
}
