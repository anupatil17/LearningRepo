package com.mmcoe.bank;

public class Accounts {

    private double balance;
    private double overdraft;

    public Accounts() {
        balance = 0;
        overdraft = 10000;
    }

    public Accounts(double balance) {
        this.balance = balance;
        overdraft = 10000;
    }

    public void deposit(double amount) {

       /* if (overdraft < 10000) {

            double need = 10000 - overdraft;

            if (amount >= need) {
                overdraft = 10000;
                balance += (amount - need);
            } else {
                overdraft += amount;
            }

        } else {
            balance += amount;
        }*/
    	overdraft+=amount;
    	if(overdraft >10000) {
    		balance=overdraft-10000;
    		overdraft=10000;
    	}
    }

    public void withdraw(double amount) throws BalanceException{

       /* if (balance >= amount) {
            balance -= amount;
        } else {
            amount -= balance;
            balance = 0;

            if (overdraft >= amount) {
                overdraft -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }*/
    	
    	if(amount <=(balance+overdraft)) {
    		balance-=amount;
    		
    		if (balance<0){
    			overdraft+=balance;
    			balance=0;
    		}
    	}
    	else {
    		throw new BalanceException("Insufficient balance");
    	}
    }

    @Override
    public String toString() {
        return "Accounts [balance=" + balance +", overdraft=" + overdraft + "]";
    }
}