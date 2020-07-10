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
public class ProxyPictures implements Pictures{
    private RealPictures realPictures;
    private String picturesName;

    public ProxyPictures(String picturesName) {
        this.picturesName = picturesName;
    }

    @Override
    public void showLayar(){
        if(realPictures == null){
            realPictures = new RealPictures(picturesName);
        }
        
        realPictures.showLayar();
    }
}
