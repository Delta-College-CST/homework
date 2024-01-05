// Delta College - CST 283 - Homework 1
// Name:  

import java.io.*;
import java.util.Scanner;

public class BillSummary 
{
    static final String FILENAME = "energy.txt";

    public static void main(String[] args) 
    {

        // Start file processing
        try 
        {
            String filename = FILENAME;
            File dataFileRef = new File(filename);

            // Check for file existence.  If not found, display error and crash
            if (!dataFileRef.exists()) 
            {
                System.out.println("File not found");
                System.exit(0);
            }

            Scanner inputFile = new Scanner(dataFileRef);

            // File processing loop.  
          
          
          
          
          
          
          
          
          

        } 
        catch (IOException e)    // If file error, display message and crash
        {
            System.out.println("File error");
            System.exit(0);
        }

    }

}
 

