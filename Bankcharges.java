
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
public class Bankcharges {
public static void main(String[] args){
    Scanner bill = new Scanner ( System.in );
    double checks;
    double basefees=10;
    double totalcharges;
    System.out.println("Enter the total number of checks");
    checks=bill.nextDouble();
    if (checks < 20)
    {
        System.out.println("Enter the number of checks:" +checks);
        totalcharges = (checks*0.10)+basefees;
        System.out.println("TOTALCHARGES:-"+ totalcharges);
    }
    else if (checks > 20 && checks < 39)
    {
        System.out.println("Enter the number of checks:" +checks);
        totalcharges = (checks*0.08)+basefees;
        System.out.println("TOTALCHARGES:-"+ totalcharges);
    }
    else if (checks > 40 && checks < 59)
    {
     System.out.println("Enter the number of checks:" +checks);
        totalcharges = (checks*0.06)+basefees;
        System.out.println("TOTALCHARGES:-"+ totalcharges);   
    }
    else if (checks >=60)
            {
                System.out.println("Enter the number of checks:" +checks);
        totalcharges = (checks*0.04)+basefees;
        System.out.println("TOTALCHARGES:-"+ totalcharges); 
                
                
            }
}    
}
