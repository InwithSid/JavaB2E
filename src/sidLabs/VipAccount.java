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
public class VipAccount extends Account{
    public double creditLimit = 100000.00;
    public String category = "Gold";
    public VipAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        super(number, balance, customerName, customerEmailAddress, customerPhoneNumber);
    }
    
    
}
