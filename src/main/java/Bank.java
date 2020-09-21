
import java.util.Scanner;

//A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
//
//$0.10 each for less than 20 checks
//
//$0.08 each for 20-39 checks
//
//$0.06 each for 40-59 checks
//
//$0.04 each for 60 or more checks
//
//Write a program that asks for the number of checks written for the month. The program should then calculate and display the banks service fees for the month. 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class Bank {
    
    public static void main(String[] args) {
        
       double Checks_used;
       double Base_fee = 10;
       double Service_fee = 0 ;
       
       System.out.println("Please enter n.o of checks used");
       
       Scanner sc = new Scanner( System.in );
       
       Checks_used = sc.nextInt();
       
       if ( Checks_used < 20 ) 
       {
           Service_fee = (double) ((Checks_used * 0.10) + Base_fee) ;
         System.out.printf("Your Service fee for this month is " + Service_fee );
       }
       else if ( Checks_used >=20 & Checks_used <40 ) {
        Service_fee = (double) ((Checks_used * 0.08) + Base_fee) ;
         System.out.printf("Your Service fee for this month is " + Service_fee );
       }
      
       else if ( Checks_used >=40 & Checks_used <60 ) {
        Service_fee = (double) ((Checks_used * 0.06) + Base_fee) ;
         System.out.printf("Your Service fee for this month is " + Service_fee );
       }
        else if ( Checks_used >=60 ) {
        Service_fee = (double) ((Checks_used * 0.04) + Base_fee) ;
         System.out.printf("Your Service fee for this month is " + Service_fee );
        }
    }
    
}

