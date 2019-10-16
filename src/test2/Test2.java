/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Manpreet
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a mile = 1.609344 kilometers 
                
        int mile = 1;
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        
        Assignment_1 str = new Assignment_1();
        
        System.out.println("This is your high score :" + highScore +
                        "\nyou have travelled " + kilometers + "kms till now" +
                        "\ni.e. you have travelled " + mile +" mile!");
        System.out.println("Name : " + str.name +"\nAge : " 
                        + str.age + "\nSchool : "
                        + str.school + "\nGrade : " + str.grade);
              
    }
    
}
