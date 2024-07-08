package OOP;

import java.util.Random;

public class Parrot extends Birds{
    private String text;

    public Parrot(String text) {
        this.text = text;
    }

    public void sing() {
        String res = "";
        for (int i = 0; i < new Random().nextInt(text.length()) + 1; i++) {
            res += text.toCharArray()[i];
        }
        System.out.println(res);
    }
}
