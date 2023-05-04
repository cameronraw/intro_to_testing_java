package main;

public record Transaction(TransactionType transactionType, int amount) {
    public int getFormattedAmount(){
        if(transactionType == TransactionType.Withdrawal){
            return amount * -1;
        }
        return amount;
    }
}
