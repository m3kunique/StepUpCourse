package OOP;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        var student = new Student("Mikhail");
        System.out.println(student.getMarks());
        System.out.println(student.toString());
    }
}
