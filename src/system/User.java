/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SIOW HAN BIN
 */
public class User {
    private String userID;
    private String username;
    private String password;
    private String role;

    // Constructor
    public User(String userID, String username, String password, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters   

    public String getuserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password; 

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

  // Function to generate a new user ID by incrementing the last ID from the file
public static String generateUserID() {
    String lastID = "0"; // Start with ID 0 if the file is empty

    try (BufferedReader br = new BufferedReader(new FileReader("user.txt"))) {
        String line;
        String[] userDetails;

        // Read through the file to find the last user ID
        while ((line = br.readLine()) != null) {
            userDetails = line.split(";");
            lastID = userDetails[0]; // Get the last user ID
        }
    } catch (IOException e) {
        // If file doesn't exist or there's an error, assume it's a new file
        System.out.println("File not found or error reading file. Starting with userID 0.");
    }

    // Increment the last ID by 1 and return the new ID
    int newID = Integer.parseInt(lastID) + 1;
    return String.valueOf(newID);
} 

}
