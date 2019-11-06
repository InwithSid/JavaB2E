/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbatch8;
import java.util.Scanner;



/**
 *
 * @author Administrator
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println("************ Welcome to SidLabs *****************\n\n");

    int row, col, i, j;
    int var[][] = new int[10][10];
    
        System.out.println("\nEnter the size of Rows : ");
        Scanner scn = new Scanner(System.in);
        row = scn.nextInt();
        System.out.println("\nEnter the size of Columns : ");
        col = scn.nextInt();
        
            System.out.println("Enter "+row*col+" number of list items");
            for (i=0; i<row; i++){
                for (j=0; j<col; j++){
                      var[i][j] = scn.nextInt();
                }
            }
        
        System.out.println("\n Your list of items are ,");
            for (i=0; i<row; i++){
                for (j=0; j<col; j++){
                      System.out.print(var[i][j]+"\t");
                }
                System.out.println("");
            }
        
    
       
    }
    
}
