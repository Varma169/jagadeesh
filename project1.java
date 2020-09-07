
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
public class project1 
{
 public static void main(String[]ar)
 {
     Scanner sales= new Scanner(System.in);
     double AMOUNT,SALESTAX,COUNTYTAX,TOTALAMOUNT,TOTALOFTHESALE; 
    System.out.println("Total bill of the items");
    AMOUNT=sales.nextDouble();
    System.out.println("ITEM PURCHASE:-"+AMOUNT);
    
    
    SALESTAX=(AMOUNT*0.04);
    
    System.out.println("state tax:-"+SALESTAX);
    
    
    COUNTYTAX=(AMOUNT*0.02);
    System.out.println("county tax:-"+COUNTYTAX);
    TOTALAMOUNT=SALESTAX+COUNTYTAX;
    System.out.println("TOTAL TAX AMOUNT:-"+TOTALAMOUNT);
    
    TOTALOFTHESALE=TOTALAMOUNT+AMOUNT;
    System.out.println("TOTAL OF THE SALE:-"+TOTALOFTHESALE);
    
   
}
}
        
    

