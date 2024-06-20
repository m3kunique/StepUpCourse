package OOP;

public class Start {
    public static void main(String[] args) {
        var f1 = new Fraction(1,3);
        var f2 = new Fraction(2, 5);
        var f3 = new Fraction(7, 8);

        System.out.println(f1.sum(f2).sum(f3).minus(5));
//      тут если чо будет ошибка

    }
}
