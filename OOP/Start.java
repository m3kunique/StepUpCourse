package OOP;

public class Start {
    public static void main(String[] args) {
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addPath(D, 6);
        A.addPath(B, 5);
        A.addPath(F, 1);

        B.addPath(A, 5);
        B.addPath(C, 3);

        C.addPath(B, 3);
        C.addPath(B, 4);

        D.addPath(A, 6);
        D.addPath(C, 4);
        D.addPath(E, 2);

        E.addPath(F, 2);

        F.addPath(E, 2);
        F.addPath(B, 1);

        System.out.println(B.travel(1));
        System.out.println(B.travel(2));
        System.out.println(B.travel(3));

    }
}
