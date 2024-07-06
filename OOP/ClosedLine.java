package OOP;

public class ClosedLine extends PolyLine{

    public ClosedLine(Point... points) {
        super(points);
    }

    public double length() {
        double sum = super.length(), len1, len2;
        len1 = points[0].getX() - points[points.length-1].getX();
        len2 = points[0].getY() - points[points.length-1].getY();
        sum += Math.sqrt(len1 * len1 + len2 * len2);
        return sum;
    }
}
