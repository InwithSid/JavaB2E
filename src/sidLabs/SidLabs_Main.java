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
public class SidLabs_Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    
    System.out.println(" -------- Welcome to SidLabs ----------- \n\n");

    
       
    // Create a new class for bank account with fields account number, balance, 
    // customer name, email and phone number + create getters & setters 
    // Create two methods a) deposit funds with balance increment
    // b) withdraw funds with balance deduction but do not allow if insufficient funds
    // put some string in the method to test they are working
  
    Account var = new Account("12345", 10000.00, "SidLabs", "myemai@yourmail.com", "12344321");
    
        System.out.println("The account balance is " + var.getBalance());
        System.out.println("The Customer name is " + var.getCustomerName());
        
        var.withdrawal(5234.83);
        
        VipAccount vr = new VipAccount("123445", 10000.00, "Sid", "myhome@yourhome.com", "12344321");
        
        System.out.println("The credit limit is : " + vr.creditLimit);
        
            
        
        //System.out.println(var.getBalance());
    
    
    
    }          
    
    }


   