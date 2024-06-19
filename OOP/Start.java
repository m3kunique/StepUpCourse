package OOP;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(5,8);
        Point p3 = new Point(10,11);
        Point p4 = new Point(15,19);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        Line l3 = new Line(p2, p3);

        System.out.println(l3.toString());
        p2.x=4;
        p3.y=18;
        System.out.println(l3.toString());

        double sum = l1.length()+ l2.length()+ l3.length();
        System.out.println(sum);
    }
}
