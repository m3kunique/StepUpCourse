package OOP.Mikhail;

public class Start {
    public static void main(String[] args) {
        CreditAccount m3k = new CreditAccount(AccountNumberGenerator.getNext(), 0, 10, "RUB");
        m3k.setInterestRate(10);
        m3k.setCreditLimit(100);
        m3k.deductsTheCommission();
        m3k.calculationOfInterest();
        m3k.replenishment(90);
    }
}
