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
    private double score;

    //constructors
    public average (int numberOfScores) {
        score = new int [numberOfScores]; //allocating memory for the array
     Scanner scanner = new Scanner(System.in);

        //ask the user to enter each score
        for (int i = 0; i< score.length; i++){
            System.out.println("Enter score number " + (i + 1) + ":");  //we need to do +1 because it starts at 0
            score[i]= scanner.nextDouble();
        }

    }
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
            for (int i = 0; data.length; i++) {
                sum += data[i];
            }
            mean = (double) sum / data.length;
        }
        public String toString () {

        }
        public void SelectionSort () {

        }
    }


