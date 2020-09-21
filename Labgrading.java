
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Labgrading {
    public static void main(String[] args){
       Scanner grade = new Scanner( System.in );
       double score1;
       double score2;
       double score3;
       double average;
       char lettergrade;
       System.out.println("Enter the first score");
       score1 = grade.nextDouble();
       System.out.println("Enter the second score");
       score2 = grade.nextDouble();
       System.out.println("Enter the third score");
       score3 = grade.nextDouble();
       average = ( score1 + score2 + score3 )/ 3;
       if(average >90 && average <100 )
       {
           lettergrade='A';
           System.out.println( "The average score : "+average);
           System.out.println(lettergrade);
       }
       else if(average >80 && average <89 )
       {
           lettergrade='B';
           System.out.println( "The average score : "+average);
           System.out.println(lettergrade);
           
       }
       else if(average >70 && average <79)
       {
           lettergrade='C';
           System.out.println( "The average score : "+average);
           System.out.println(lettergrade);
           
        }
       else if (average >60 && average <69)
       {
           lettergrade='D';
           System.out.println( "The average score : "+average);
           System.out.println(lettergrade);
                 }
       else if(average< 60)
               {
                   lettergrade='F';
           System.out.println( "The average score: "+average);
           System.out.println(lettergrade);
                   
               }
    }
           
           
           
       }
       
       
       
       
       
       
       
    
        
        

