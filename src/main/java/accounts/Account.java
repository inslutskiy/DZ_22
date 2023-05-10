package accounts;

import myInterface.MoneyTarget;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected long amount;

    public Account (String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    public abstract boolean pay (long pay);

    public abstract boolean add (long add);

    public boolean transfer(Account accountTo, long amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean accept (long add) {
        return add(add);
    }
}
