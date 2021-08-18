package com.senecafoundation;
import java.io.File; 
public class DeleteFromCSV {
    //Add ability to delete objects from file
  public static void deleteFromCSV() { 
      File myObj = new File("filename.txt"); 
      if (myObj.delete()) { 
        System.out.println("Deleted the file: " + myObj.getName());
      } else {
        System.out.println("Failed to delete the file.");
      } 
    } 
  }