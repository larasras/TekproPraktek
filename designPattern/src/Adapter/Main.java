/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Laras Rasdiyani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PicturesViewer pictures = new Png();
        pictures.view("logopolban.png");
        
        pictures = new PicturesAdapter(new Jpg());
        pictures.view("logopolban.jpg");
        
        pictures = new PicturesAdapter(new Jpeg());
        pictures.view("logopolban.jpeg");
    }
    
}
