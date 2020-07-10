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
public class CookingFood {
    private Food burger;
    private Food spagetthi;
    private Food lasagna;

    public CookingFood(){
        burger = new Burger();
        spagetthi = new Spagetthi();
        lasagna = new Lasagna();
    }

    public void cookBurger(){
        burger.cook();
    }
    
    public void cookSpagetthi(){
        spagetthi.cook();
    }
    
    public void cookLasagna(){
        lasagna.cook();
    }
}
