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
public interface ISubject {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObserver();
}
