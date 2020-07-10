/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Laras Rasdiyani
 */
public class Customer implements IObserver{
    private ISubject subject;
    private String customerName;

    public Customer(ISubject subject, String customerName){
        this.subject = subject;
        this.customerName = customerName;
    }
    
    @Override
    public void update(){
        System.out.println("Red bag available");
        buyBag();
    }

    private void buyBag(){
        System.out.println(customerName + " get new red bag from this bag store\n");
    }
    
    private void unsubscribe(){
        subject.removeObserver(this);
    }
}
