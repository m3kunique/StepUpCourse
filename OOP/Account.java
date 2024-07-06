package OOP;

public class Account {
    private int accNumber;
    private long remains;

    public Account(int accNumber, long remains) {
        this.accNumber = accNumber;
        this.remains = remains;
    }

    public Account(int accNumber) {
        this(accNumber, 0);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public long getRemains() {
        return remains;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setRemains(long remains) {
        this.remains = remains;
    }
}
