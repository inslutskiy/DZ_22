package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, long amount) {
        super(name, amount);
    }

    public boolean pay (long pay) {
        if ((amount - pay) < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean add (long add) {
        amount += add;
        return true;
    }

    public void Info () {
        System.out.println("Имя: " + name);
        System.out.println("Баланс: " + amount);
    }

    public String toString () {
        return "Имя: " + name + ", Баланс: " + amount;
    }
}
