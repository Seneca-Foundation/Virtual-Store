package com.senecafoundation;

import java.io.File;  
import java.io.IOException;

public class CreateCSV {
    public static void createCSV(String fileName)
    {
        try 
        {
            String newFileName = fileName+".csv";
            File newFile = new File("src/main/java/com/senecafoundation/"+newFileName);
            if (newFile.createNewFile()) 
            {
              System.out.println("File created: " + newFile.getName());
            } 
            else 
            {
              System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
