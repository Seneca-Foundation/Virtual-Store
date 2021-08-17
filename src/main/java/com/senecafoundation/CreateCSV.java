package com.senecafoundation;

import java.io.File;  
import java.io.IOException;
import javax.swing.JOptionPane;

public class CreateCSV {
    public static void createCSV(String fileName)
    {
        try 
        {
            String newFileName = fileName+".csv";
            File newFile = new File("src/main/java/com/senecafoundation/"+newFileName);
            if (newFile.createNewFile()) 
            {
              JOptionPane.showMessageDialog(null, "File created: " + newFile.getName());
            } 
            else 
            {
              JOptionPane.showMessageDialog(null, "File already exists.");
            }
        } 
        catch (IOException e) 
        {
          JOptionPane.showMessageDialog(null, "An error occurred.");
        }
    }
}
