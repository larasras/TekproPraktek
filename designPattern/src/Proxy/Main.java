/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Laras Rasdiyani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pictures pictures = new ProxyPictures("laras.png");
        
        //load from desktop
        System.out.println("pictures will be load from desktop");
        pictures.showLayar();
        
        //not be load from desktop
        System.out.println("\npictures will not be load from desktop");
        pictures.showLayar();
    }
    
}
