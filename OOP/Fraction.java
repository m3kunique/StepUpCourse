package OOP;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 0) throw new IllegalArgumentException("сосать лол");
        if (denominator == 0) throw new IllegalArgumentException("чел, ты не можешь делить на ноль");
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fraction) {
        if (denominator == fraction.getDenominator())
            return new Fraction(numerator + fraction.getNumerator(),
                    denominator + fraction.getDenominator());
        return new Fraction((numerator * fraction.getDenominator() + fraction.getNumerator() * denominator),
                denominator * fraction.getDenominator());
    }

    public Fraction sum(int x) {
        return sum(new Fraction(numerator + x*denominator, denominator));
    }

    public Fraction minus(Fraction fraction) {
        if (denominator == fraction.getDenominator())
            return new Fraction(numerator - fraction.getNumerator(),
                    denominator - fraction.getDenominator());
        return new Fraction(numerator * fraction.getDenominator() - fraction.getNumerator() * denominator,
                denominator * fraction.getDenominator());
    }

    public Fraction minus(int x) {
        return minus(new Fraction(numerator - x * denominator, denominator));
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
