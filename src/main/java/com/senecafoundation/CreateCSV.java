package com.senecafoundation;
import java.io.*;
//import java.io.File;
//import java.io.PrintWriter;
public class CreateCSV {
    public void readCSV()
    {
        String file = "src/main/java/com/senecafoundation/Books.csv";
        BufferedReader reader = null;
        String line = "";
        try 
        {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null)
            {
                String[] row = line.split("");
                for(String index : row)
                {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
