
package com.programs;

public class TestscoresDemo {
   private double[] scores;
   double sumOfNumbers = 0;

   public TestscoresDemo(double array[]) {
      
       for (int i = 0; i < array.length; i++) {
           scores = new double[array.length];
        
           if (array[i] < 0 || array[i] > 100) {
        
               throw new IllegalArgumentException(
                      
                       "Negative scores" + "\n\tInvalid score found." + "\n\tElement: " + i + " Score: " + array[i]);
           } else {
               
               scores[i] = array[i];
               sumOfNumbers += array[i];
           }
       }
   }

   public double getAverage() {
       return sumOfNumbers / scores.length;
   }
}