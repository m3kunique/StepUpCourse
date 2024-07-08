package OOP;

import java.util.Random;

public class Parrot implements Birds{
    private final String text;

    public Parrot(String text) {
        this.text = text;
    }

    public void sing() {
        System.out.println(text.substring(0,new Random().nextInt(text.length()) + 1));
    }
}
