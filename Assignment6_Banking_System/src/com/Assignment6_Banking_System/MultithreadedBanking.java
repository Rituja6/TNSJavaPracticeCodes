package com.Assignment6_Banking_System;


class MultithreadedBankAccount {
    private int accountNumber;
    private double balance;

    public MultithreadedBankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    public synchronized void deposit(double amount) {
        double temp = balance + amount;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = temp;
        System.out.println(Thread.currentThread().getName() + " deposited: $" + amount + " | Current Balance: $" + balance);
    }

    
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            double temp = balance - amount;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = temp;
            System.out.println(Thread.currentThread().getName() + " withdrew: $" + amount + " | Current Balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed: Insufficient Funds! | Current Balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class TransactionTask implements Runnable {
    private MultithreadedBankAccount account;
    private boolean isDeposit;
    private double amount;

    public TransactionTask(MultithreadedBankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class MultithreadedBanking {
    public static void main(String[] args) throws InterruptedException {
        MultithreadedBankAccount account = new MultithreadedBankAccount(101, 1000.00);

        System.out.println("=== Starting Concurrent Banking Transactions ===");
        System.out.println("Initial Balance: $" + account.getBalance());
        System.out.println("------------------------------------------------");

       
        Thread t1 = new Thread(new TransactionTask(account, true, 500.00), "Customer 1 (Deposit)");
        Thread t2 = new Thread(new TransactionTask(account, false, 200.00), "Customer 2 (Withdrawal)");
        Thread t3 = new Thread(new TransactionTask(account, true, 300.00), "Customer 3 (Deposit)");
        Thread t4 = new Thread(new TransactionTask(account, false, 1500.00), "Customer 4 (Withdrawal)");

      
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("------------------------------------------------");
        System.out.println("Final Balance: $" + account.getBalance());
    }
}