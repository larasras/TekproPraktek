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
public class DoCalculate {
    private Strategy strategy;

    public DoCalculate(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doCalculateBil(int bil1, int bil2){
        return strategy.calculate(bil1, bil2);
    }
}
