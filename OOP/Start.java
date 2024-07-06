package OOP;

public class Start {
    public static void main(String[] args) {
        var f1 = new Fraction(3, 5);
        var f2 = new Fraction(49, 12);
        var f3 = new Fraction(3, 2);
        var f4 = new Fraction(1, 3);

        System.out.println(SumCalculator.sum(2, f1, 2.3));
        System.out.println(SumCalculator.sum(3.6, f2, 3, f3));
        System.out.println(SumCalculator.sum(f4, 1));
    }
}
