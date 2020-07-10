/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Laras Rasdiyani
 */
public class Sum implements Strategy{

    @Override
    public int calculate(int bil1, int bil2){
        return bil1 + bil2;
    }   
}
