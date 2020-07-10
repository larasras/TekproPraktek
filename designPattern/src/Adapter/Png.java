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
public class Png implements PicturesViewer{

    @Override
    public void view(String filename){
        System.out.println("View Png File " + filename);
    }
}
