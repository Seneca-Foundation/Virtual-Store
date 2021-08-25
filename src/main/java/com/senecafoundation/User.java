package com.senecafoundation;

import java.io.File;
import java.util.Scanner;

public class User {
    private static Scanner userScanner;
    public static boolean verifyLogin(String username, String password)
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
    
}
