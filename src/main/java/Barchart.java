
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class Barchart {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter Today's Sales for Store 1: ");
        int store1 = sc.nextInt();
        System.out.println("Enter Today's Sales for Store 2: ");
        int store2 = sc.nextInt();
        System.out.println("Enter Today's Sales for Store 3: ");
        int store3 = sc.nextInt();
        System.out.println("Enter Today's Sales for Store 4: ");
        int store4 = sc.nextInt();
        System.out.println("Enter Today's Sales for Store 5: ");
        int store5 = sc.nextInt();
        
        System.out.println("SALES BAR CHART");
        System.out.printf("Store 1:");
         
         for(int i=1; i<= store1/100; i++)
            {
             System.out.printf("*");
            }
        
        
        System.out.printf("\nStore 2:");
         for(int i=1; i<=store2/100; i++)
            {
             System.out.printf("*");
            }
        System.out.printf("\nStore 3:");
         for(int i=1; i<=store3/100; i++)
            {
             System.out.printf("*");
            }
        
   
        System.out.printf("\nStore 4:");
         for(int i=1; i<=store4/100; i++)
            {
             System.out.printf("*");
            }
        System.out.printf("\nStore 5:");
        for(int i=1; i<=store5/100; i++)
            {
             System.out.printf("*");
            }
        
    }
}
