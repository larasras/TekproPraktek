/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Laras Rasdiyani
 */
public class Burger implements Food{

    @Override
    public void cook(){
        System.out.println("Burger has been cooked");
    }  
}
