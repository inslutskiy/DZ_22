package accounts;

public class SavingsAccount extends Account {
    protected long minLimit;
    public SavingsAccount(String name, long amount, long minLimit) {
        super(name, amount);
        this.minLimit = minLimit;
    }

    public boolean pay (long pay) {
        if ((amount - pay) < minLimit) {
            return false;
        } else {
            return true;
        }
    }

    public boolean add (long add) {
        amount += add;
        return true;
    }
}
