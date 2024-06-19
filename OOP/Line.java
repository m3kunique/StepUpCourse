package OOP;

public class Line {
    private Point p1;
    private Point p2;

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
        double x = (p1.x - p2.x);
        double y = (p1.y - p2.y);
        return Math.sqrt(x*x+y*y);
    }
}
