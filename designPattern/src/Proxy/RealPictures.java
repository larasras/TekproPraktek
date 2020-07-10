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
public class RealPictures implements Pictures{
    public String picturesName;

    public RealPictures(String picturesName) {
        this.picturesName = picturesName;
        loadFromDesktop(picturesName);
    }
    
    @Override
    public void showLayar(){
        System.out.println("Show " + picturesName);
    }

    private void loadFromDesktop(String picturesName){
        System.out.println("Load " + picturesName + " from desktop");
    }
}
