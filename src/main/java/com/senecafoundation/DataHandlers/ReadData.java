package com.senecafoundation.DataHandlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import com.senecafoundation.FundamentalObjects.StoreItem;
import com.senecafoundation.ProductObjects.Basketball;
import com.senecafoundation.ProductObjects.BookObjects.Book;
import com.senecafoundation.ProductObjects.Computer;
import com.senecafoundation.ProductObjects.Powerplant;

public class ReadData implements IReadData {

    private String filepath;
    private File file;
    private Scanner fileScanner;

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    
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

    @Override
    public List<StoreItem> ReadAll() {

        List<StoreItem> itemsToReturn = new ArrayList<StoreItem>();

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
                
            // separate the line by commas into properties
            String[] props = line.split(",");

            // if the first property is a StoreItem
            if (props[0].equals("StoreItem")) {                
                StoreItem storeItemToReturn = new StoreItem(props[2], Double.parseDouble(props[3]), props[4]);
                storeItemToReturn.setID(UUID.fromString(props[1]));       
                itemsToReturn.add(storeItemToReturn);
            }
            else if (props[0].equals("Computer")) {                
                Computer computerToReturn = new Computer(props[2], Double.parseDouble(props[3]), props[4], props[5], props[6], props[7], Double.parseDouble(props[8]));
                computerToReturn.setID(UUID.fromString(props[1]));       
                itemsToReturn.add(computerToReturn);
            }
            else if (props[0].equals("Powerplant")){
                Powerplant energyToReturn = new Powerplant(props[2], Double.parseDouble(props[3]), props[4], Double.parseDouble(props[5]));
                energyToReturn.setID(UUID.fromString(props[1]));       
                itemsToReturn.add(energyToReturn);
            }
            else if (props[0].equals("Basketball")) {
                Basketball basketballToReturn = new Basketball(props[2], Double.parseDouble(props[3]), Integer.parseInt(props[4]), Integer.parseInt(props[5]), props[6], props[7], Double.parseDouble(props[8]));
                basketballToReturn.setID(UUID.fromString(props[1]));
                itemsToReturn.add(basketballToReturn);
            }
            else if (props[0].equals("Book")) {
                Book booktoReturn = new Book(props[2], Double.parseDouble(props[3]), props[4], props[5], props[6], Double.parseDouble(props[7]));
                booktoReturn.setID(UUID.fromString(props[1]));
                itemsToReturn.add(booktoReturn);
            }
        }

        return itemsToReturn;
    }
}
