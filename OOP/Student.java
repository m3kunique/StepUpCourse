package OOP;

import java.util.ArrayList;

public class Student {
    private final String name;
    private ArrayList<Integer> marks;
    Rule b;

    public Student(String name, Rule b) {
        this.name = name;
        this.b = b;
        this.marks = new ArrayList<>();
    }

    public ArrayList<Integer> getMarks() {
        return new ArrayList<>(marks); // Возвращаем копию списка для безопасности
    }

    public void addMark(int mark) {
        if (b.check(mark)) {
            marks.add(mark);
        } else {
            System.out.println("Оценка должна сохранять правило.");
        }
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Оценки: %s", name, marks.toString());
    }
}
