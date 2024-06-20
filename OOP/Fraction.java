package OOP;

public class Fraction {
    private final int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        if (denum < 0) throw new IllegalArgumentException("сосо");
        if (denum == 0) throw new IllegalArgumentException("сосо");
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
}
