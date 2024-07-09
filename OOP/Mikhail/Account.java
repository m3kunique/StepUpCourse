package OOP.Mikhail;

public abstract class Account {
    private double fee;
    private Currency currency;

    public Account(int accountNumber, double remains, double fee, String currency) {
        this.fee = fee;
        this.currency = new Currency(currency, remains, accountNumber);
        System.out.printf("Создан счет\n%s\n", getCurrency().toString());
    }

    public Account(int accountNumber, double remains, double fee) {
        this(accountNumber, remains, fee, "RUB");
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency, double fee) {;
        this.fee = fee;
        this.currency = currency;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

//метод вычитающий комиссию из остатка
    public void deductsTheCommission() {
        double value = currency.getValue();
        currency.replenishment(-value*fee);
    }

    public void debitingTheValue(double amount) {
        currency.replenishment(-amount);
        System.out.printf("Списано со счета: %f\nОстаток на счете: %f%n", amount, currency.getValue());
    }

//    пополнение счета на сумму value
    public void replenishment(double value) {
        currency.replenishment(value);
    }

}
