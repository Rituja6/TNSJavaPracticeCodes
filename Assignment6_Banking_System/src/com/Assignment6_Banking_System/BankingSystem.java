package com.Assignment6_Banking_System;


class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class BankAccount {
    private int accountNumber;
    private double balance;


    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Amount successfully deposited: $" + amount);
    }

    
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Attempted to withdraw $" + amount + " with balance of $" + balance);
        }
        balance -= amount;
        System.out.println("Amount successfully withdrawn: $" + amount);
    }

    
    public void displayBalance() {
        System.out.println("Account No: " + accountNumber + " | Current Balance: $" + balance);
    }
}


public class BankingSystem {
    public static void main(String[] args) {
       
        BankAccount account = new BankAccount(101, 500.00);

        System.out.println("=== Initial Account Status ===");
        account.displayBalance();

        System.out.println("\n=== 1. Demonstration: Valid Deposit ===");
        try {
            account.deposit(200.00);
            account.displayBalance();
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Deposit transaction attempt finished.");
        }

        System.out.println("\n=== 2. Demonstration: Invalid Deposit (Negative Amount) ===");
        try {
            account.deposit(-50.00);
        } catch (InvalidAmountException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Deposit transaction attempt finished.");
        }

        System.out.println("\n=== 3. Demonstration: Valid Withdrawal ===");
        try {
            account.withdraw(150.00);
            account.displayBalance();
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal transaction attempt finished.");
        }

        System.out.println("\n=== 4. Demonstration: Insufficient Funds Withdrawal ===");
        try {
            account.withdraw(1000.00);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal transaction attempt finished.");
        }
    }
}