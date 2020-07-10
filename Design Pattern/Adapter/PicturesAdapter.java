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
public class PicturesAdapter implements PicturesViewer{
    private AddtionalPicturesViewer pictures;

    public PicturesAdapter(AddtionalPicturesViewer pictures) {
        this.pictures = pictures;
    }
    
    @Override
    public void view(String filename){
        System.out.print("Using Adapter ==> ");
        pictures.viewFile(filename);
    }
}
