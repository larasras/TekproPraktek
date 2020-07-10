/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.Scanner;

/**
 *
 * @author Laras Rasdiyani
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        if(CurrentUser.isLoggedIn()){
          System.out.println("User " + CurrentUser.user().getUsername() + "has login");
        } else {
            System.out.println("No user has logged in yet");
            System.out.println("Enter username: ");
            String username = input.nextLine();
            System.out.println("Enter password: ");
            String password = input.nextLine();
            CurrentUser.login(username, password);
        }
        
        System.out.println("\nThe logged in user is:");
        System.out.println("Username: " + CurrentUser.user().getUsername());
        System.out.println("Password: " + CurrentUser.user().getPassword());
        System.out.println("\nThe user will logout...");
        CurrentUser.logout();
        System.out.println("User has logout!");
        if(CurrentUser.isLoggedIn()) {
            System.out.println("There are still users who are login");
        } else {
            System.out.println("No user login");
        }
    }
}
