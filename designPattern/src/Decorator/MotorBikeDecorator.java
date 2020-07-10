/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Laras Rasdiyani
 */
public class MotorBikeDecorator implements Motorbike{
    protected Motorbike motorBike;

    public MotorBikeDecorator(Motorbike motorBike) {
        this.motorBike = motorBike;
    }
    
    @Override
    public void InitiaDesign(){
        this.motorBike.InitiaDesign();
    } 
}
