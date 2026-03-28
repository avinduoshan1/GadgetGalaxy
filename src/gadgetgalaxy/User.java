/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadgetgalaxy;



public class User {
    private String username;
    private String password;
    private String type;


    public User(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }


    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getType() { return type; }


    @Override
    public String toString() {
        return username + "," + password + "," + type;
    }
}