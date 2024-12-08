package average;

import java.util.Scanner;
import java.io.*;
/** 
This program creates a list of songs for a CD 
by reading from a file. 
*/ 
    public class CompactDisk {

        public static void main(String[] args) throws IOException {

             //I used notepad to save the classic.txt file and copied its path here
            Scanner input = new Scanner(new File("C://Users//Vedika//Documents//Classics.txt"));

                String title;
                String artist;
                //Task3 declaring an Array of size 6
                Song[] cd = new Song[6];

                //task 3 , filing the array by creating a new Song object with the title
                //and artist and storing it in the appropriate position in the array

            for(int i =0; i< cd.length; i++) {
                title = input.nextLine();
                artist = input.nextLine();
                //creating a new Song object and store it in the array
                cd [i] = new Song(title, artist);
            }


             //Task3 printing the content of the Array to the console
                System.out.println("Contents of Classics:");
                  for (int i = 0; i < cd.length; i++) {
                        //printing each object in the Array
                         System.out.println(cd[i].toString());
                }
        }
    }