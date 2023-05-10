package accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, long amount) {
        super(name, amount);
    }

    @Override
    public boolean add (long add) {
        if ((amount + add) > 0) {
            return false;
        } else {
            amount += add;
            return true;
        }
    }

    @Override
    public boolean pay (long pay) {
        amount -= pay;
        return true;
    }
}
