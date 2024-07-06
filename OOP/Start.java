package OOP;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Client misha = new Client("m3k", "misha", "75 18 128 910");
        System.out.println(misha.getName());
        System.out.println(misha.getSurname());
        System.out.println(misha.getPassport());
        Account stoooo = new Account(1, 100);
        Account minusDvesti = new Account(2, -200);
        misha.addAcc(stoooo);
        misha.addAcc(minusDvesti);
        System.out.println("Денег на счету по поиску: " + misha.getAcc(1).getRemains());
        System.out.println("Все счета: " + misha.getAccs());
        System.out.println("Положительные счета: " + misha.getPositiveAccs());
        misha.delAcc(1);
        System.out.println("Удаление счета");
        System.out.println("Остаток на всех счетах: " + misha.getReamains());
        misha.decRemains(minusDvesti, 200);
        System.out.println("Уменьшение счета на 200");
        System.out.println("Остаток на всех счетах: " + misha.getReamains());
        System.out.println("Увеличение счета на 1000");
        misha.addRemains(minusDvesti, 1000);
        System.out.println("Остаток на всех счетах: " + misha.getReamains());
    }
}
