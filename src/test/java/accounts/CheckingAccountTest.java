package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CheckingAccountTest {

    Account checkingAccount = new CheckingAccount("Расчетный счет №1", 1000);
    Account savingsAccount = new SavingsAccount("Накопительный №1", 1500, 250);
    @Test
    void Test1() {
        int x = 1000;
        String expect = "true";
        String result = String.valueOf(checkingAccount.pay(x));
        Assertions.assertEquals(expect, result);
    }

    @Test
    void Test2(){
        int x = 1100;
        String expect = "true";
        String result = String.valueOf(checkingAccount.add(x));
        Assertions.assertEquals(expect, result);
    }

    @Test
    void Test3() {
        int x = 1000;
        String expect = "true";
        String result = String.valueOf(savingsAccount.pay(x));
        Assertions.assertEquals(expect, result);
    }
}