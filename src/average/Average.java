/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class Average {

    private int[] data;
    private double mean;


    //constructors
    public Average() {
    data = new int[5];
    //asking for the user input
    Scanner scanner = new Scanner (System.in);


        //ask the user to enter each score(5 scores)
        for (int i = 0; i< data.length; i++){
            System.out.println("Enter score number " + (i + 1) + ":");  //we need to do +1 because it starts at 0
            data[i]= scanner.nextInt();
        }

        //calling the methods
        SelectionSort();
        calculateMean();

    }
        //method to calculate the mean
        public void calculateMean () {
            int sum = 0;
            for (int i = 0; i< data.length; i++) sum += data[i];
            mean = (double) sum / data.length;
        }


         //toString method
        public String toString () {
         //descending order
            String result = "Score in descening order";
            for(int i=0; i< data. length ; i++){
                result += data[i] + "\n";
            }
            //add the mean at the end of the String
            result += "Mean : "+ mean;
            return result;
        }


        //SelectionSort Method
        public void SelectionSort () {
          for (int i =0; i<data.length -1; i++){
              for (int j=i+1; j<data.length ; j++){
                  if (data[j]> data [i]){
                      int temp = data[i];
                      data [i]= data [j];
                      data [j]=temp;
                  }
              }

          }


        }
    }


