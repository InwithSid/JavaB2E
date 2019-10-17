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
    Assignment_1 var = new Assignment_1();
    System.out.println(" -------- Welcome to SidLabs ----------- ");

    //int testValue = 2;
    
    for (int i=2; i<9; i++){
        System.out.println("\n 10,000 at 2% is = " + String.format("%.2f", var.calculateInterest(10000.0, i)));
    }
    
    int count = 0;
    
    while(count != 9){
        System.out.println("Count value is :" + count);
        count++;
    }
    
    count = 0;
    
    do {
        System.out.println("Count value is :" + count);
        count++;
        }while (count != 9);   
    
    
//    switch (testValue){
//        case 1:
//            System.out.println("\n the test value is 1");
//            break;
//        case 2:
//            System.out.println("\n the test value is 2");
//            break;
//        case 3:
//            System.out.println("\n the test value is 3");
//            break;
//        default:
//            System.out.println("\n the test value is not in the range of 1 to 3 ");
//            break;
//    }
//    
    
//    if (testValue == 1) {
//        System.out.println("\n the test value is 1");
//    } else if (testValue == 2){
//        System.out.println("\n the test value is 2");
//    } else if (testValue == 3){
//        System.out.println("\n the test value is 3");
//    } else {
//        System.out.println("\n the test value is not in the range of 1 to 3 ");
//    }
//    
   
    
    
    
    
    
//    
//        System.out.println("\n" + var.printAssign("Geeta", 24, "Global School", 3) );
//        
//        
    }
          
    
    }


   