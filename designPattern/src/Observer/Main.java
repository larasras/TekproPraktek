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
        
        Customer customer = new Customer(redBag, "Laras");
        redBag.addObserver(customer);
        
        redBag.setAvailable(true);
    }
    
}
