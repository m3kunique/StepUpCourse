package OOP.Mikhail;

public class AccountNumberGenerator {
    private static int x = 0;

    public static int getNext() {
        return ++x;
    }

    public static int getCurrent() {
        return x;
    }

    public void reset() {
        x = 0;
    }
}
