package com.senecafoundation;

public class DeleteFromCSV {
    //Add ability to delete objects from file
}
import java.io.File; 
public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
