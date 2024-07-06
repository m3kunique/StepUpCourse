package OOP;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(1, 2);
        LengthImpl a = new LengthImpl();

        PolyLine polyLine = new PolyLine(p1, p2, p3);
        System.out.println(a.getLength(polyLine));

        PolyLine closedLine = new ClosedLine(p1, p2, p3);
        System.out.println(a.getLength(closedLine));

        System.out.println(a.getLength(polyLine, closedLine));
    }
}
