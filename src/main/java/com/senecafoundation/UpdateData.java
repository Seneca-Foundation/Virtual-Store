package com.senecafoundation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.UUID;

public class UpdateData implements IUpdateData{
    //Add ability to update existing objects from file and resave back to file
    public StoreItem Update(StoreItem item){
  Scanner sc = new Scanner(System.in);

    String tempFile;
    String filepath;
    String name;
    String description;
    String price;
    UUID ID;
        
   UpdateStoreItem(filepath, name, description, price, ID);
   }

   private void UpdateStoreItem(String filepath, String name, String description, String price, UUID iD) {
    }

public static void StoreItem(String filepath, String name, String description, Double price, Double ID)
   {
       String tempFile = "temp.txt";
       File oldFile = new File(filepath);
       File newFile = new File(tempFile);
       String name = ""; String description = ""; String price =""; String ID ="";
       try 
       {
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while(x.hasNext())
            {
                name = x.next();
                description = x.next();
                price = x.next();
                ID = x.next();
                if(ID.equals(StoreItem))
                {
                    pw.println(newName + "," + newDescription + "," + newPrice + "," + newID);
                }
                else
                {
                    pw.println(Name + "," + Description + "," + Price + "," + ID);
                }
                

            }
            x.close();
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
