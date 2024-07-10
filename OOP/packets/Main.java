package OOP.packets;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pow("2", "4"));;
    }

    static double Pow(String x, String y) {
        return Math.pow(Integer.parseInt(x), Integer.parseInt(y));
    }
}
