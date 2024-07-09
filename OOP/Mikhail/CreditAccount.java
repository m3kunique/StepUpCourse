package OOP.Mikhail;

import java.time.Year;

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
}
