package com.senecafoundation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.UUID; 
public class DeleteData implements IDeleteData {
  private static final String STRING = ",";
  String tempFile;
  String filepath;
  String name;
  String description;
  String price;
  UUID ID;

  @Override
  public void Delete(String ID, Object removeTerm) {
  
    //Add ability to delete objects from file

  File oldFile = new File(filepath);
  File newFile = new File(tempFile);

  try  
    {
     FileWriter fw = new FileWriter(tempFile, true);
     BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter pw = new PrintWriter(bw);
     Scanner x= new Scanner (new File(filepath));
     x.useDelimiter(STRING);
     
     while(x.hasNext())
      {
        ID = x.next();
        name = x.next ();
        price = x.next();
        description = x.next();
        if(ID.equals(removeTerm))
        {
          pw.println(ID + STRING + name + STRING + price + STRING + description);
        }
        x.close();
        pw.flush();
        pw.close ();
        oldFile.delete();
        File dump = new File (filepath);
        newFile.renameTo(dump);
      }
    }
    catch(Exception e) {

    }

  }

  @Override
  public void Delete(UUID ID) {
    // TODO Auto-generated method stub
    
  }
  }