package com.senecafoundation;

import java.io.*;

public class ReadCSV {
    public static String file = "";

    public static void readCSV(String newFile)
    {
        file = newFile;
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
                    System.out.print(index);
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
