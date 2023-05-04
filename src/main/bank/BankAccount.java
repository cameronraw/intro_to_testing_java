package main.bank;

import java.util.ArrayList;

public class BankAccount {

    private final ArrayList<Transaction> transactions;

    public BankAccount(){
        this.transactions = new ArrayList<>();
    }
    public void deposit(int amount) {
        Transaction newDeposit = new Transaction(TransactionType.Deposit, amount);
        transactions.add(newDeposit);
    }
    public void withdraw(int amount) {
        Transaction newWithdrawal = new Transaction(TransactionType.Withdrawal, amount);
        transactions.add(newWithdrawal);
    }
    public String printBalance() {
        int totalBalance = 0;
        for (Transaction transaction : this.transactions) {
            totalBalance += transaction.getFormattedAmount();
        }
        return String.format("The total balance is: %s", totalBalance);
    }
}

