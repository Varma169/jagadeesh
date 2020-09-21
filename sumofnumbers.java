
import static java.time.Clock.system;
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
public class sumofnumbers {
 public static void main(String[] args){
     Scanner add = new Scanner ( System.in );
     double number;
     double i;
     double sum=0;
     System.out.println("Enter the non zero integer");
     number = add.nextDouble();
     for( i=1;i<=number;i++ )
     {
      sum= sum + i;   
     System.out.println(i );
     }
     
     System.out.println("sum:" +sum);
         
     
     
 }   
}
