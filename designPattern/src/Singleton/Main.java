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
          System.out.println("User " + CurrentUser.user().getUsername() + "telah login");
        } else {
            System.out.println("Belum ada user yang login");
            System.out.println("Masukkan username: ");
            String username = input.nextLine();
            System.out.println("Masukkan password: ");
            String password = input.nextLine();
            CurrentUser.login(username, password);
        }
        
        System.out.println("\nUser yang telah login adalah :");
        System.out.println("Username: " + CurrentUser.user().getUsername());
        System.out.println("Password: " + CurrentUser.user().getPassword());
        System.out.println("\nUser akan logout...");
        CurrentUser.logout();
        System.out.println("User telah logout!");
        if(CurrentUser.isLoggedIn()) {
            System.out.println("Masih ada user yang login");
        } else {
            System.out.println("Tidak ada user yang login");
        }
    }
}
