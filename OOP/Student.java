package OOP;

import java.util.ArrayList;

public class Student {
    private final String name;
    private ArrayList<Integer> marks;

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public ArrayList<Integer> getMarks() {
        return new ArrayList<>(marks); // Возвращаем копию списка для безопасности
    }

    public void addMark(int mark) {
        if (mark >= 2 && mark <= 5) {
            marks.add(mark);
        } else {
            System.out.println("Оценка должна быть в диапазоне от 2 до 5.");
        }
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Оценки: %s", name, marks.toString());
    }
}
