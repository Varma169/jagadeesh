/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cookies;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Cookie {
   
 public static void main(String[] args)
        {
             
            int cookies;
           
            int cookieatePerson;
            Scanner sc= new Scanner(System.in);
     
            System.out.println("There are 40 bag cookies:-");
            System.out.println("PERSON EAT EACH COOKIE CAN CONSUME OF 30 calories:-");
            System.out.println("cookies eaten by man:-");
            cookieatePerson=sc.nextInt();
           
     
            cookies=cookieatePerson*30;

            System.out.println("cookies eaten by man:- "+cookieatePerson);
            System.out.println("calories consumed by man:-"+cookies);

        }
 
}
