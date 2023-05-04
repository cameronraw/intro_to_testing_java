package test;

import main.bank.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankAccountShould {
    @Test
    void return_deposits_made_in_balance(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        String balanceStatement = bankAccount.printBalance();
        assertEquals("The total balance is: 1000", balanceStatement);
    }
    @Test
    void return_withdrawals_made_in_balance(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(2000);
        String balanceStatement = bankAccount.printBalance();
        assertEquals("The total balance is: -1000", balanceStatement);
    }
}
