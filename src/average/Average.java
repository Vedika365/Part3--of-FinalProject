/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;

/**
 *
 * @author Vedika
 */
public class Average {
import java.util.Arrays;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance variables
        int[] data;
        double mean;

        //constructors
        public Average(){
            data = new int [5];  //the array can hold 5 elements
            mean = 0.0;
        }
        public void calculateMean( ){
          int sum =0;
          for (int i=0; data.length; i++ ){
              sum +=data[i];
          }
          mean = (double) sum/data.length;
        }
        public String toString(){

        }
        public void SelectionSort(){

        }
    }
    
}
