package OOP.geometry;

import OOP.Lengthable;

import java.util.Arrays;

public class PolyLine implements Lengthable {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].getX() - points[i + 1].getX();
            len2 = points[i].getY() - points[i + 1].getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }

    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.points);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PolyLine other = (PolyLine) obj;
        return Arrays.deepEquals(this.points, other.points);
    }
}

