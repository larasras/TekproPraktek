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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CookingFood cookingFood = new CookingFood();
        
        cookingFood.cookBurger();
        cookingFood.cookSpagetthi();
        cookingFood.cookLasagna();
    }
    
}
