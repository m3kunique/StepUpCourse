package OOP.Mikhail;

import java.time.Year;
import java.util.Objects;

public class CreditAccount extends Account {
    private double interestRate = 0; // процентная ставка в процентах (надо будет на 100 делить)
    private double creditLimit = 0; // кредитные лимит
    private double accruedInterest = 0; //начисленнные проценты
    private double accruedCommissions = 0; //начисленнные комиссионные


    public CreditAccount(int accountNumber, double remains, double fee, String currency) {
        super(accountNumber, remains, fee, currency);
    }

    public CreditAccount(int accountNumber, double remains, double fee) {
        super(accountNumber, remains, fee);
    }

    public CreditAccount(int accountNumber, double remains, double fee,
                         String currency, double interestRate, double creditLimit) {
        super(accountNumber, remains, fee, currency);
        this.interestRate = interestRate;
        this.creditLimit = creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getAccruedInterest() {
        return accruedInterest;
    }

    public double getAccruedCommissions() {
        return accruedCommissions;
    }

    @Override
    public void debitingTheValue(double amount) throws InsufficientFundsException{
        var currency = super.getCurrency();
        if (amount > currency.getValue()) throw new InsufficientFundsException("Недостаточно средств");
        if (amount > creditLimit) throw new InsufficientFundsException("Превышен кредитный лимит");
        currency.replenishment(-amount);
        System.out.printf("Списано со счета: %f\nОстаток на счете: %f%n", amount, currency.getValue());
    }

    public void calculationOfInterest() {
        double remains = super.getCurrency().getValue();
        if (remains < creditLimit) {
            accruedInterest += (creditLimit - remains)*(interestRate / (Year.now().isLeap() ? 366 : 365)) / 100;
        }
    }

    @Override
    public void deductsTheCommission() {
        accruedCommissions += super.getFee();
    }

    @Override
    public void replenishment(double value) {
        double temp = value-accruedCommissions;
        accruedCommissions -= Math.min(value, accruedCommissions);
        if (temp > 0) {
            value = temp - accruedInterest;
            accruedInterest -= Math.min(temp,accruedInterest);
            if (value > 0){
                super.getCurrency().replenishment(value);
                System.out.println(getCurrency().getValue());
            }
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CreditAccount that = (CreditAccount) object;
        return Double.compare(this.getCurrency().getAccountNumber(), that.getCurrency().getAccountNumber()) == 0;
    }

    public int hashCode() {
        int hash = 10000000;
        hash ^= this.getCurrency().hashCode();
        hash ^= getCurrency().hashCode();
        hash ^= Double.hashCode(creditLimit);
        hash ^= Double.hashCode(interestRate);
        hash ^= Double.hashCode(accruedCommissions);

        return hash;
    }
}
