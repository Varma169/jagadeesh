/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programs;

import java.util.Arrays;

/**
 *
 * @author jack
 */
public class Array {
    
     public static void main(String[] args) {
        int[] array = { 100,200,800,900,700,40,-22 };
        Array aa = new Array();
        System.out.println("Total Size of array : " + aa.getTotal(array));
        System.out.println("Average of array: " + aa.getAverage(array));
        System.out.println("Highest number in a array : " + aa.getHighest(array));
        System.out.println("Lowest number in a array : " + aa.getLowest(array));
    }
     
     long getTotal(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++)
        sum = sum + array[i];
        return sum;
        }

    double getAverage(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++)
        sum = sum + array[i];
        return sum / array.length;
    }

    long getHighest(int[] array) {
    Arrays.sort(array);
    return array[array.length - 1];
    }

    int getLowest(int[] array) {
    Arrays.sort(array);
    return array[0];
    }
    
   
}

    