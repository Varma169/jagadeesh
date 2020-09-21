
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
public class Barchart {
    public static void main(String[] args){
        String asterix="*";
        Scanner Keyboard = new Scanner ( System.in );
        double sales=0;
        double store1;
        double store2;
        double store3;
        double store4;
        double store5;
        System.out.println("Enter the sales for today in store 1");
        store1 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in store 2");
        store2 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in store 3");
        store3 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in store 4");
        store4 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in store 5");
        store5 = Keyboard.nextDouble();
        Keyboard.nextLine();
      /*  if(sales >=100 || sales <=200)
        {
            System.out.println("asterix");
        }*/
        for( int i=1;i<=store1/100;i++ )
     {
         
     System.out.print("*");
     }
        System.out.println();
        for( int i=1;i<=store2/100;i++ )
        {
            System.out.print("*");
        }
        System.out.println();
        for ( int i=1;i<=store3/100;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for( int i=1;i<=store4/100;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for( int i=1;i<=store5/100;i++)
        {
            System.out.print("*");
        }
        }
        
            
        }
     
        

