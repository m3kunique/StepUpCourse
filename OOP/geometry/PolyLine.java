package OOP.geometry;

import OOP.Lengthable;

public class PolyLine implements Lengthable {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length-1; i++) {
            len1 = points[i].getX() - points[i + 1].getX();
            len2 = points[i].getY() - points[i + 1].getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }
}
