
import java.util.Scanner;

//Write a program that asks the user for a positive nonzero integer value. 
//The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
//For example, if the user enters 50, the loop will find the sum of 1,2,3,4...50.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class Sum {
    
    public static void main(String[] args) {
        int number = 0;
        int count  = 0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner( System.in );
        number = sc.nextInt();
        
        for(int i=1; i<= number; i++)
        {
            count += i;
            
        }
        System.out.println("The sum is " +count );
    }
          
}
