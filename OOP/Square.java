package OOP;

public class Square {
    private int x, y;
    private int length;

    public Square(int x, int y, int length) {
        this.x = x;
        this.y = y;
        if (length<=0) throw new IllegalArgumentException("Это не квадрат, братик");
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLength() {
        return length;
    }

    public void setX(int x) {
        this.x=x;
    }

    public void setY(int y) {
        this.y=y;
    }

    public void setLength(int length) {
        if (length<=0) throw new IllegalArgumentException("Это не квадрат, братик");
        this.length=length;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке [%d, %d] со стороной %d", this.getX(), this.getY(), this.getLength());
    }

}

