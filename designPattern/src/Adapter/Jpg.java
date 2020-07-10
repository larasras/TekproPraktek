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
public class Jpg implements AddtionalPicturesViewer{

    @Override
    public void viewFile(String filename){
        System.out.println("View Jpg File " + filename);
    }  
}
