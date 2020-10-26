/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programs;

/**
 *
 * @author DELL
 */

import java.util.*;
public class greaterNumberOfArray
{
  
   public static void main(String[] args)
   {
       int[] array1 = {-1,4,5,8,9,10,-2};
       int firstNumber=-1;
       ScanNumbers(array1,firstNumber);
      
       int[] array2 = {22,24,26,28};
       int lastNumber = 22;
       ScanNumbers(array2, lastNumber);
   }
   
   public static void ScanNumbers(int[] array,int n)
   {
   for(int i=0; i<array.length; i++)
   {
       if (array[i]>n)
           System.out.println(array[i]);
   }
   System.out.println();
}
}

