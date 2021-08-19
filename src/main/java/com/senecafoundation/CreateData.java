package com.senecafoundation;

import java.io.*;

import javax.swing.JOptionPane;

public class CreateData implements ICreateData{
    //ability to create new objects and save to file
    static String filepath;
    public void Create()
    {
        try 
        {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            System.out.println("");
            pw.println(name +","+price+","+description);
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
