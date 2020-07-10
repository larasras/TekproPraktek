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
public class RacingMotorbike extends MotorBikeDecorator{
    
    public RacingMotorbike(Motorbike motorBike) {
        super(motorBike);
    }

    @Override
    public void InitiaDesign() {
        super.InitiaDesign();
        System.out.println(" is added designs for racing type motorbikes\n");
    }
    
}
