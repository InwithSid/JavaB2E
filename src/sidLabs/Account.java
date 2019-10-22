/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidLabs;

/**
 *
 * @author Manpreet
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    
    public void deposit(double depositAmmount){
        this.balance += depositAmmount;
        System.out.println("Deposit of " + depositAmmount + " has been processed.." + 
                            "\nYour availabe balance is :" + this.balance);
        }
    
    public void withdrawal(double withdrawalAmmount){
        if (this.balance - withdrawalAmmount <=0){
            System.out.println("Only " + this.balance + " is avalaible in your account!"
                                + "\n Withdrawal is not processed at this time.");
        }else{
            this.balance -= withdrawalAmmount;
            System.out.println("Withdrawal of " + withdrawalAmmount + " has been processed"
                                + "\n Your available balance is " + this.balance);
        }
        
        
        
        }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    
    
    
}
