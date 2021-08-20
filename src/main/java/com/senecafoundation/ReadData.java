package com.senecafoundation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.UUID;

public class ReadData implements IReadData {

    String filepath;
    private File file;
    private Scanner fileScanner;

    @Override
    public StoreItem Read(UUID ID) {
        // open the file
        try {
            this.file = new File(filepath);
            this.fileScanner = new Scanner(this.file);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // search the file for the id
        while (this.fileScanner != null && this.fileScanner.hasNextLine()) {
            
            // read the line with the id
            String line = this.fileScanner.nextLine();
            
            if(line.contains(ID.toString())) { 
                
                // separate the line by commas into properties
                String[] props = line.split(",");

                // if the first property is a StoreItem
                if (props[0].equals("StoreItem")) {
                    
                    // create a StoreItem object using the properties
                    StoreItem storeItemToReturn = new StoreItem(props[2], Double.parseDouble(props[3]), props[4]);
                    storeItemToReturn.setID(UUID.fromString(props[1]));
                        
                    // return the object (Computer, Basketball, etc.) at the end
                    return storeItemToReturn;
                }
            }
        }

        return null;
    }
    
}
