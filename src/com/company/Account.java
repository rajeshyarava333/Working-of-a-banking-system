package com.company;

public class Account{
    int acc_no;
    String name;
    float amount;
    void insert(int a, String n, float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + " deposited");
    }
    void withdraw(float amt){
        if (amount<amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount=amount-amt;
            System.out.println(amt + " withdrawn");
        }
    }
    void checkBalance(){
        System.out.println("Balance is: " + amount);
    }
    void display(){
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
    class TestAccount{
    public static void main(String[] args){
        Account a1=new Account();
        a1.insert(6282728,"Rajesh",5000);
        a1.display();
        a1.checkBalance();
        a1.deposit(50000);
        a1.checkBalance();
        a1.withdraw(25000);
        a1.checkBalance();
    }
}
