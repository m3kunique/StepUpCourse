package OOP;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        ArrayList<Point> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);

        BrokenLine bL = new BrokenLine(arr);

        System.out.println(bL.length());
        System.out.println(bL.toString());
        System.out.println(bL.getArrOfLines());
        double tmp = 0;
        for (Line i : bL.getArrOfLines()) {
            tmp += i.length();
        }
        System.out.println(tmp);
        System.out.println(tmp == bL.length());
        p2.setCoord(12, 8);
        System.out.println(bL.length());
        System.out.println(bL.toString());
    }
}
