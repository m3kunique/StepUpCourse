package OOP;

import java.util.Random;

public class Cuckoo extends Birds {
    public void sing() {
        for (int i = 0; i < new Random().nextInt(10) + 1; i++) {
            System.out.println("ку-ку");
        }
    }
}
