package com.senecafoundation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.UUID;

public class UpdateData implements IUpdateData{
    //Add ability to update existing objects from file and resave back to file
    String tempFile;
    String filepath;
    String name;
    String description;
    String price;
    UUID ID;
    Scanner fileScanner;
    public StoreItem Update(StoreItem item){
        Scanner fileScanner = new Scanner(System.in);
       String tempFile = "temp.txt";
       File oldFile = new File(filepath);
       File newFile = new File(tempFile);
       try 
       {
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            fileScanner = new Scanner(new File(filepath));
            fileScanner.useDelimiter("[,\n]");

            while(fileScanner.hasNext())
            {
                name = fileScanner.next();
                description = fileScanner.next();
                price = fileScanner.next();
                ID = fileScanner.next();
                UUID testID = item.ID;
                if(ID.equals(testID))
                {
                    pw.println(item.name + "," + item.description + "," + item.price + "," + item.ID);
                }
                else
                {
                    pw.println("Did not update");//pw.println(Name + "," + Description + "," + Price + "," + ID);
                }
                

            }
            fileScanner.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        }

    
       catch(Exception e)
        {
            System.out.println("Error");
        }
    }





}
