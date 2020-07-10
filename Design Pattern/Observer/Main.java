/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Laras Rasdiyani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RedBag redBag = new RedBag(true);
        
        Customer customer1 = new Customer(redBag, "Laras");
        redBag.addObserver(customer1);
        
        Customer customer2 = new Customer(redBag, "Rasti");
        redBag.addObserver(customer2);
        
        Customer customer3 = new Customer(redBag, "Anugrah");
        redBag.addObserver(customer3);
        
        redBag.setAvailable(true);
    }
    
}
