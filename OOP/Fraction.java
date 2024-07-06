package OOP;

public class Fraction extends Number {
    private final int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public int getNum() {
        return num;
    }

    public int getDenum() {
        return denum;
    }

    public Fraction sum(Fraction f) {
        if (denum == f.getDenum())
            return new Fraction(num + f.getNum(), denum);
        return new Fraction(num * f.getDenum() + f.getNum() * denum, f.denum * denum);
    }

    public Fraction sum(int x) {
        return new Fraction(num + x * denum, denum);
    }

    public Fraction minus(Fraction f){
        if (denum == f.getDenum())
            return new Fraction(num - f.getNum(), denum);
        return new Fraction(num * f.getDenum() - f.getNum() * denum, denum * f.getDenum());
    }

    public Fraction minus(int x) {
        return new Fraction(num - x * denum, denum);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.getNum(), this.getDenum());
    }

    @Override
    public int intValue() {
        return (int) num/denum;
    }

    @Override
    public long longValue() {
        return (long) num/denum;
    }

    @Override
    public float floatValue() {
        return (float) num/denum;
    }

    @Override
    public double doubleValue() {
        return (double) num/denum;
    }
}
