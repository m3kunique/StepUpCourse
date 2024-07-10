package OOP.geometry;

import java.util.ArrayList;

public class BrokenLine {
    ArrayList<Line> arr = new ArrayList<>();
    private ArrayList<Point> arrIn = new ArrayList<>();


    public BrokenLine() {

    }

    public BrokenLine(ArrayList<Point> arrOfPoints) {
        this.arr = getArrOfLines(arrOfPoints);
        this.arrIn = arrOfPoints;
    }

    public ArrayList<Line> getArrOfLines() {
        return this.arr;
    }

    private ArrayList<Line> getArrOfLines(ArrayList<Point> arrIn) {
        ArrayList<Line> arrOut = new ArrayList<>();
        for (int i = 0; i < arrIn.size() - 1; i++) {
            arrOut.add(new Line(arrIn.get(i), arrIn.get(i + 1)));
        }
        return arrOut;
    }

    public double length() {
        double ret = 0;
        for (Line i : arr) {
            ret += i.length();
        }
        return ret;
    }

    @Override
    public String toString() {
        return String.format("Линия %s", arrIn.toString());
    }
}
