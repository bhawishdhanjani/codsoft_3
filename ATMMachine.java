package com.codsofttask3;

public class ATMMachine implements ATM{
    private UserBankAccount userBankAccount;

    public ATMMachine(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }

    @Override
    public String withdraw(int amount) {
        if (amount>0){
            if(amount > userBankAccount.getBalance()){
                return "Transaction Failed: Insufficient Amount";
            }
            else {
                userBankAccount.setBalance(userBankAccount.getBalance() - amount);
                return "Amount Withdraw Successful. New Balance is " + userBankAccount.getBalance();
            }
        }
        else{
            return "Enter Valid Amount.";
        }

    }

    @Override
    public String deposit(int amount) {
        if (amount>0){
            userBankAccount.setBalance(userBankAccount.getBalance()+amount);
            return "Amount Deposit Successful. New Balance is " + userBankAccount.getBalance();
        }
        else{
            return "Enter Valid Amount.";
        }
    }

    @Override
    public String checkBalance() {
        return  "Balance is " + userBankAccount.getBalance();
    }
}
