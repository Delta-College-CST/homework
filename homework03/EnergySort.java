// Delta College - CST 283 - Homework 1
// Name:  

import java.io.*;
import java.util.Scanner;

public class EnergySort
{
    static final String FILENAME = "energy.txt";
    static final int NUMBER_MONTHS = 36;

    public static void main(String[] args) 
    {
        int month[]   =  new int[NUMBER_MONTHS];
        int year[]    =  new int[NUMBER_MONTHS];
        int energy[]  =  new int[NUMBER_MONTHS];

        try   // Capture file
        {
            String filename = FILENAME;
            File dataFileRef = new File(filename);
            String oneLine = "";

            // Check for file existence.  If not found, display error and crash
            if (!dataFileRef.exists()) 
            {
                System.out.println("File not found");
                System.exit(0);
            }

            int i = 0;

            Scanner inputFile = new Scanner(dataFileRef);
            while (inputFile.hasNext()) {
                // File processing loop.
                oneLine = inputFile.nextLine();

                String dataLine[] = oneLine.split(",");

                month[i]  = Integer.parseInt(dataLine[0]);
                year[i]   = Integer.parseInt(dataLine[1]);
                energy[i] = Integer.parseInt(dataLine[2]);

                i++;
            }
        } 
        catch (IOException e)    // If file error, display message and crash
        {
            System.out.println("File error");
            System.exit(0);
        }

        displayArrays(month,year,energy);           // Display initial lists

        sortChronologically(month,year,energy);     // Sort by time
        displayArrays(month,year,energy);           // Display

        sortByDescendingEnergy(month,year,energy);  // Sort energy usage - descending
        displayArrays(month,year,energy);           // Display

    }

    // Method displays parallel arrays in current order
    public static void displayArrays(int month[], int year[], int energy[])
    {
        System.out.println("\n");
        for (int i = 0; i < NUMBER_MONTHS; i++ )
        {
            System.out.println(String.format("%2d-%4d ==> %5d", month[i],year[i],energy[i]));
        }
        System.out.println("\n");
    }

    // Sort arrays ascending chronologically
    public static void sortChronologically(int month[], int year[], int energy[])
    {

    }

    // Sort arrays descending by energy usage
    public static void sortByDescendingEnergy(int month[], int year[], int energy[])
    {

    }
}
 

