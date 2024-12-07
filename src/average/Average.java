/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class average {

    private int[] data;
    private double mean;
   // private double[] score;

    //constructors
    public Average() {
    data = new int[5];
    Scanner scanner = new Scanner (System.in);
    //public average (int numberOfScores) {
      ///  score = new double[numberOfScores]; //allocating memory for the array
    // Scanner scanner = new Scanner(System.in);

        //ask the user to enter each score
        for (int i = 0; i< data.length; i++){
            System.out.println("Enter score number " + (i + 1) + ":");  //we need to do +1 because it starts at 0
            data[i]= scanner.nextDouble();
        }

    }
    //calling the methods
    selectionSort();
    calcualteMean();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for user input
        Scanner scanner = new Scanner(System.in);
        int scores = scanner.nextInt();
        int[] score = new int[5];



            //ask the user to enter each score

        }
        public void calculateMean () {
            int sum = 0;
            for (int i = 0; i< data.length; i++) {
                sum += data[i];
            }
            mean = (sum / data.length);
        }
        public String toString () {

        }
        public void SelectionSort () {
          for (int i =0; i<data.length -1; i++){
              for (int j=i+1; j<data.length ; j++){
                  if (data [j]>[i]){
                      int temp = data[i];
                      data [i]= data [j];
                      data [j]=temp;
                  }
              }

          }



        }
    }


