package com.senecafoundation.StoreCheckout;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class User {
    private Scanner userScanner;
    private String userpath;
    private static String password;
    private static String username;
    public boolean verifyLogin(String username, String password)
    {
        boolean found  = false;
        String tempUsername = "";
        String tempPassword = "";
        try {
            userScanner = new Scanner(new File("src/main/java/com/senecafoundation/Users.csv"));
            userScanner.useDelimiter("[,\n]");
            while (userScanner.hasNext() && !found)
            {
                tempUsername = userScanner.next();
                tempPassword = userScanner.next();
                if (tempUsername.trim().equals(username) && tempPassword.trim().equals(password.trim()))
                {
                    found = true;
                }
            }
            userScanner.close();
            return found;
        }
        catch (Exception e) {
            return found;
        }
    }
    public String getUserpath() {
        return userpath;
    }
    public void setFilepath(String userpath) {
        this.userpath = userpath;
    }
    public static String toUser()
    {
        return username + "," + password;
    }
    public String createAccount(String username, String password) {
       User.username = username;
       User.password = password;
        try 
        {
            FileWriter fw = new FileWriter(userpath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(toUser());
            pw.flush();
            pw.close();
            return "Account has been created.";
        }
        catch(Exception e)
        {
            return "Something went wrong. Account was not created.";
        }
    }
    
}
