/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Laras Rasdiyani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motorbike racingMotorbike = new RacingMotorbike(new BasicMotorbike());
        racingMotorbike.InitiaDesign();
        
        SportMotorbike sportMotorbike = new SportMotorbike(new BasicMotorbike());
        sportMotorbike.InitiaDesign();
    }   
}
