//Write a program that has variables to hold three test scores. The program should ask the user to enter three test scores and assign the values entered to the variables. The program should display the average of the test scores and the letter grade that is assigned for the test score average. Use the grading scheme below:

//90-100 = A
//80-89 = B
////70-79=C
//60-69=D
//Below 60=F
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
public class Grades {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        // Scores
        double Score1;
        double Score2; 
        double Score3;
        double avg;
 
        //User enter score
        System.out.println("Please enter your first score");
        Score1 = sc.nextDouble();
        
        System.out.println("Please enter your second score");
        Score2 = sc.nextDouble();
        
        System.out.println("Please enter your third score");
        Score3 = sc.nextDouble();
        
        // Formula
        
        avg = (Score1 + Score2 + Score3 )/ 3 ;
        
        //logic
        
        if( avg < 60)
        {
            System.out.printf("Try hard next time, \n \n You have secured an F,\n \n The average score is " +avg );
         } 
        else if (avg < 70 )
        {
            System.out.printf("Just crossed the border line,\n \n You have secured an D, \n \n The average score is ", +avg );
        }
        else if (avg < 80 )
        {
            System.out.printf("Try Hard, \n \n You have secured an C.\n \n The average score is ", +avg );
        }
        else if (avg < 90 )
        {
            System.out.printf("One more step to A, \n \n You have secured an B. \n \n The average score is ", +avg );
        }
        
        else if (avg <= 100 )
        {
            System.out.printf("CONGRATS, \n \n You have secured an A. \n \n The average score is ", +avg );
        }
        
        else {
        
        System.out.println("Try again with valid scores to check");
        }
           
    }
  
}
