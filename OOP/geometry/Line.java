package OOP.geometry;

import OOP.Lengthable;

import java.util.Objects;

public class Line implements Lengthable {
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
        double x = (p1.getX() - p2.getX());
        double y = (p1.getY() - p2.getY());
        return Math.sqrt(x * x + y * y);
    }

    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.p1);
        hash = 17 * hash + Objects.hashCode(this.p2);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Line other = (Line) obj;
        if (!Objects.equals(this.p1, other.p1)) {
            return false;
        }
        if (!Objects.equals(this.p2, other.p2)) {
            return false;
        }
        return true;
    }

    public Line clone() throws CloneNotSupportedException {
        Line line = (Line) super.clone();
        line.p1 = p1.clone();
        line.p2 = p2.clone();
        return line;
    }
}
