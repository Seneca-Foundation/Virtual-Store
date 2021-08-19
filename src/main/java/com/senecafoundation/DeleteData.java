package com.senecafoundation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.UUID; 
public class DeleteData implements IDeleteData {

    //Add ability to delete objects from file
  String tempFile;
  String filepath;
  public void Delete(String ID) { 
  File oldFile = new File(filepath);
  File newFile = new File(tempFile);
    try  
    {
     FileWriter fw = new FileWriter(tempFile, true);
     BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter pw = new PrintWriter(bw);
     Scanner x= new Scanner (new File(filepath));
     x.useDelimiter(",");
     
     while(x.hasNext())
      {
        ID = x.next();
        name = x.next ();
        age = x.next();
        if(ID.equals(removeTerm))
        (
          pw.printIn(ID + "," + name + "," + age);
        )
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
}