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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoCalculate doCalculate = new DoCalculate(new Sum());
        System.out.println("5 + 5 = " + doCalculate.doCalculateBil(5, 5));
        
        doCalculate = new DoCalculate(new Multiply());
        System.out.println("5 x 5 = " + doCalculate.doCalculateBil(5, 5));
        
        doCalculate = new DoCalculate(new Div());
        System.out.println("5 / 5 = " + doCalculate.doCalculateBil(5, 5));
    }
    
}
