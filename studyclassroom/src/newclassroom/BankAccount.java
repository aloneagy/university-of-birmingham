package newclassroom;

import java.util.Objects;

public class BankAccount {
    int accountNumber;
    String accountName;
    int balance;

    public BankAccount(double v) {
    }


    public boolean equals(BankAccount a) {

        return this.accountNumber == a.accountNumber &&
                this.balance == a.balance &&
                this.getAccountName()==a.getAccountName();
    }


    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }

    public BankAccount(int accountNumber, String accountName, int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}



