package OOP.Mikhail;

public class Currency {
    private String currency;
    private double value;
    private int accountNumber;

    public Currency(String currency, double value, int accountNumber) {
        this.currency = currency;
        this.value = value;
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return String.format("Валютный счет (%s): %f", currency, value);
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void replenishment(double value) {
        this.value += value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currency='" + currency + '\'' +
                ", value=" + value +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
