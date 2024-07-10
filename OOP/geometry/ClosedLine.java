package OOP.geometry;

public class ClosedLine extends PolyLine{

    public ClosedLine(Point... points) {
        super(points);
    }

    public double length() {
        return super.length() + new Line(points[0], points[points.length-1]).length();
    }
}
