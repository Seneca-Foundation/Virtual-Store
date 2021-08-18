package com.senecafoundation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner; 
public class DeleteFromCSV {
    //Add ability to delete objects from file
  public static void deleteFromCSV() { 
     FileWriter fw = new FileWriter(tempFile, true);
     BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter pw = new PrintWriter(bw);
     
     x= new Scanner (new File(filepath);
     x.close();
     pw.flush();
     pw.close ();
     File oldFile;
    oldFile.delete();
     File dump = new File (filepath);
     File newFile;
    newFile.renameTo(dump);
  }

}