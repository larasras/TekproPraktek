/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Laras Rasdiyani
 */
public class CurrentUser {
    private static User activeUser = null;
    
    private CurrentUser(){
        
    }
    
    public static User user(){
        return activeUser;
    }

    public static void login(String username, String password){
        activeUser = new User(username, password);
    }

    public static void logout(){
        activeUser = null;
    }
    
    public static boolean isLoggedIn(){
        if(activeUser == null){
            return false;
        }
        else{
            return true;
        }
    }
}
