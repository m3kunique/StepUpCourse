package OOP.geometry;

import OOP.Lengthable;

public class Line implements Lengthable {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return String.format("Линия от %s до %s", p1.toString(), p2.toString());
    }

    public double length() {
        double x = (p1.getX() - p2.getX());
        double y = (p1.getY() - p2.getY());
        return Math.sqrt(x * x + y * y);
    }
}
