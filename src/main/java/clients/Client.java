package clients;
import accounts.Account;
import myInterface.MoneyTarget;

public class Client implements MoneyTarget {
    protected String name;
    protected static Account[] accounts;

    public Client (String name, int max) {
        this.name = name;
        this.accounts = new Account[max];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет!");
    }

    public boolean pay(long pay) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].pay(pay)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(long add) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].add(add)) {
                return true;
            }
        }
        return false;
    }
}
