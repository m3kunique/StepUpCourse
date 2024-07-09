package OOP.Mikhail;

public class DebitAccount extends Account{

    public DebitAccount(int accountNumber, double remains, double fee, String currency) {
        super(accountNumber, remains, fee, currency);
    }

    public DebitAccount(int accountNumber, double remains, double fee) {
        super(accountNumber, remains, fee);
    }

}
