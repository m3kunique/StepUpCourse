package OOP;

import java.util.ArrayList;

public class Client {
    private final String name;
    private final String surname;
    private final String passport;
    private ArrayList<Account> allAccounts = new ArrayList<>();


    public Client(String name, String surname, String passport, Account account) {
        this.passport = passport.replace(" ", "");
        this.surname = surname;
        this.name = name;
        if (account == null) {
        } else {
            this.allAccounts.add(account);
        }
    }

    public Client(String name, String surname, String passport) {
        this(name, surname, passport, null);
    }

    public Account getAcc(int accNumber) {
        for (Account account : allAccounts) {
            if (account.getAccNumber() == accNumber) {
                return new Account(account.getAccNumber(), account.getRemains());
            }
        }
        return null;
    }

    public ArrayList<Account> getAccs() {
        return allAccounts;
    }

    public long getReamains() {
        long res = 0;
        for (Account account : allAccounts) {
            res += account.getRemains();
        }
        return res;
    }

    public ArrayList<Account> getPositiveAccs() {
        ArrayList<Account> res = new ArrayList<>();
        for (Account account : allAccounts) {
            if (account.getRemains() > 0) res.add(account);
        }
        return res;
    }

    public void delAcc(int accNumber) {
        allAccounts.removeIf(acc -> acc.getAccNumber() == accNumber);
        ;
    }

    public void addAcc(Account account) {
        if (!allAccounts.contains(account))
            allAccounts.add(account);
    }

    public void decRemains(Account account, int dec) {
        if (allAccounts.contains(account)) account.setRemains(account.getRemains() - dec);
    }

    public void addRemains(Account account, int add) {
        if (allAccounts.contains(account)) account.setRemains(account.getRemains() + add);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassport() {
        return passport;
    }
}
