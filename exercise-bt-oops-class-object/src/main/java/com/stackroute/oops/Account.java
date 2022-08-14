package com.stackroute.oops;

/*
   This class is used to store account details
 */
public class Account {
    //CREATE THE PRIVATE PROPERTIES
    private static int counter;
    private final int accountNo;
    private double balance;
    private String status;

    public Account(double balance, String status) {
        counter++;
        this.accountNo = counter;
        this.balance = balance;
        this.status = status;


    }

    public boolean depositAmount(double amount) {

        if(this.status =="active") {
            this.balance = this.balance + amount;
            return true;
        }
        else
            return false;
    }

    public String getAccountDetails() {
        //                [Account No : 1, Status : active, Balance : 100.5]
        return "[Account No : " +this.accountNo+", Status : " + this.status + ", Balance : " + Double.toString(this.balance)+"]";
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int count) {
        //noinspection ReassignedVariable
        counter = count;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
            this.status = status;
    }
}