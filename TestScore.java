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
public class TestScore{
   public static void main(String[] args) throws Exception {
       
       double[] negativeScores = { 17.5, 22.7, 77.0, 199.0, 34.0 };
       double[] positiveScores = { 27.5, 55.2, 45.0, 57.0, 33.0 };
       TestscoresDemo result = null;
       // Start tshe try block.
       try {
           result = new TestscoresDemo(negativeScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       // Start the try block.
       try {
           result = new TestscoresDemo(positiveScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
      
       System.out.print("Positive scores" + "\n\tThe average of the positive scores is " + result.getAverage());
   }  

    private TestScore(double[] negativeScores) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}