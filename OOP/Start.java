package OOP;

public class Start {
    public static void main(String[] args) {
        var stud = new Student("Mikhaiil", x->x%2==0);
        stud.addMark(4);
        stud.addMark(5);
        stud.addMark(6);
        System.out.println(stud.toString());
    }
}
