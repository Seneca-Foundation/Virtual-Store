package com.senecafoundation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;

public class UUIDToCSV {
    public static void addUUIDToCSV(String filepath) {
    try 
    {
        BufferedReader csvReader = new BufferedReader(new FileReader("Path to existing csv"));
        String delimiter = ",";
        List<List<String>> rows = new ArrayList<>();
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(delimiter);
            rows.add(Arrays.asList(data));
        }
        csvReader.close();

        FileWriter csvWriter = new FileWriter("Path to final csv");
        for (List<String> rowData : rows) {

            csvWriter.append(UUID.randomUUID().toString());
            csvWriter.append(delimiter);
            csvWriter.append(String.join(delimiter, rowData));
            csvWriter.append(System.lineSeparator());
        }
        csvWriter.flush();
        csvWriter.close();
        JOptionPane.showMessageDialog(null, "UUID added.");
    }
    catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "UUID not added.");
        }
    }
}
