package com.senecafoundation;

import java.io.*;
import javax.swing.JOptionPane;

public class ExpandCSV {
    //ability to create new objects and save to file
    public static void saveToCSV(String name, double price, String author,String cover, String description, double weight, String filepath)
    {
        try 
        {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            System.out.println("");
            pw.println(name+","+price+","+author+","+cover+","+description+","+weight+",");
            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null, "Product saved to inventory");
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Product not saved to inventory");
        }
    }
}
