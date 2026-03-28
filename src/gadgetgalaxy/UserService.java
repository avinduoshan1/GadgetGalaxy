package gadgetgalaxy; 

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    
    private final String FILE_NAME = "users.txt";


    public ArrayList<User> getAllUsers() {
        ArrayList<User> userList = new ArrayList<>();
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return userList;

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data.length == 3) {

                    userList.add(new User(data[0], data[1], data[2]));
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }


    public boolean addUser(User user) {
 
        ArrayList<User> allUsers = getAllUsers();
        for (User u : allUsers) {
            if (u.getUsername().equals(user.getUsername())) {
                return false; 
            }
        }
        
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
 
            bw.write(user.getUsername() + "," + user.getPassword() + "," + user.getType());
            bw.newLine();
            return true;
            
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public void deleteUser(String username) {
        ArrayList<User> allUsers = getAllUsers();
        ArrayList<User> newList = new ArrayList<>();
        
        for (User u : allUsers) {

            if (!u.getUsername().equals(username)) {
                newList.add(u);
            }
        }
        saveAll(newList); 
    }


    public boolean updateUser(String oldUsername, User newUser) {
        ArrayList<User> allUsers = getAllUsers();
        ArrayList<User> newList = new ArrayList<>();
        boolean found = false;
        
        for (User u : allUsers) {
 
            if (u.getUsername().equals(oldUsername)) {
                newList.add(newUser); 
                found = true;
            } else {
                newList.add(u); 
            }
        }
        
        if (found) {
            saveAll(newList);
            return true;
        }
        return false;
    }


    private void saveAll(ArrayList<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (User u : users) {
                bw.write(u.getUsername() + "," + u.getPassword() + "," + u.getType());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}