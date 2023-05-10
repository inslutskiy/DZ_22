import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Account checkingAccount1 = new CheckingAccount("Расчетный счет №1", 1000);
        System.out.println("Покупку на 1500 - " + checkingAccount1.pay(1500));
        System.out.println("Покупку на 500 - " + checkingAccount1.pay(500));
        System.out.println("Пополнение на 800 - " + checkingAccount1.add(800));
        System.out.println("------------------");

        Account savingsAccount1 = new SavingsAccount("Накопительный №1", 1500, 250);
        System.out.println("Покупку на 1300 - " + savingsAccount1.pay(1300));
        System.out.println("Пополнение на 500 - " + savingsAccount1.pay(500));
        System.out.println("Пополнение на 1000 - " + savingsAccount1.add(1000));
        System.out.println("------------------");

        Account creditAccount1 = new CreditAccount("Кредитный №1", -10000);
        System.out.println("Покупку на 1500 - " + creditAccount1.pay(1500));
        System.out.println("Пополнение на 9000 - " + creditAccount1.add(9000));
        System.out.println("Пополнение на 3000 - " + creditAccount1.add(3000));
        System.out.println("Пополнение на 1000 - " + creditAccount1.add(1000));
        System.out.println("------------------");

        Client client = new Client("Петя", 3);
        client.add(new CheckingAccount("Расчетный счет", 1000));
        client.add(new SavingsAccount("Накопительный ", 1500, 1000));
        client.add(new SavingsAccount("Кредитный ", 10000, 2500));
        client.add(new CreditAccount("Кредитный ", 200000));

        System.out.println("------------------");
        for (int i : new int[]{100, 10000000, 5000, 10000}) {
            System.out.println(client.pay(i));
        }

        System.out.println("------------------");
        Account checkingAccount2 = new CheckingAccount("Расчетный счет №2", 100000);
        Account checkingAccount3 = new CheckingAccount("Расчетный счет №3", 0);

        System.out.println(checkingAccount2.transfer(checkingAccount3, 500000));

        System.out.println(client.pay(100));

        System.out.println(checkingAccount1.accept(1500));
    }
}