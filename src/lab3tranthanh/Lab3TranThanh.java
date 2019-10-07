/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3tranthanh;

import java.util.Scanner;

/* Lab2
 * Compare a number that the user inputs to a random number being generated. Counts the number of tries.
 * Author: Thanh Tran
 * Date: October 15, 2018
 */

public class Lab3TranThanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare variables 
        int num;    // declares the user input
        int count = 0;  // declares count with an initialization of 0
        
        int x = (int)(Math.random() * 50) + 0;      // computer generates a random number between 0 and 50
        
        // do while loop
        do {
          
            Scanner input = new Scanner (System.in);        // creates scanner object
            System.out.println ("Guess a number:");
            num = input.nextInt();      // takes user input
            
            // displays output to user according to the conditions
            if (num < x) {
                System.out.println ("Your guess is less than the number. Please try again");
            }
            else if (num > x) { 
                System.out.println ("Your guess is greater than the number. Please try again");
            }
            
            count++;    // counts the number of times the user tries to guess the number
            
        } while(num != x);        
        
        // displays output to the user
        System.out.println ("Excellent you got it!");
        System.out.printf ("The number is +%5d! \n", x );
        System.out.printf ("You go it in +%5d tries.\n", count);
        System.out.println ("Game is Over!");
    }
    
}
