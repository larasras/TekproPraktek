/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author Laras Rasdiyani
 */
public class RedBag implements ISubject{
    private boolean available = true;
    private ArrayList<IObserver> customers;

    public RedBag(boolean available){
        this.available = available;
        customers = new ArrayList<IObserver>();
    }
    
    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
        if(isAvailable()){
            notifyObserver();
        }
    }
    
    @Override
    public void addObserver(IObserver o){
        customers.add(o);
    }

    @Override
    public void removeObserver(IObserver o){
        customers.remove(o);
    }

    @Override
    public void notifyObserver(){
        for(int i=0; i<customers.size(); i++){
            customers.get(i).update();
        }
    }   
}
