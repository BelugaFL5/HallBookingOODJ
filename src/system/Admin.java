/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

/**
 *
 * @author SIOW HAN BIN
 */
public class Admin extends User {
    public Admin(String userID, String username, String password, String role) {
        super(userID,username, password, "Admin");
    }
    //admin authetication where it is read from text file
      private boolean authenticateAdmin(String username, String password) {
        return equals(username) && equals(password);
    }
}
