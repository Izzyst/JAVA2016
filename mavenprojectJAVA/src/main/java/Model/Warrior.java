/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Izabela
 */
public class Warrior extends Player implements Strategy{
    public Warrior()
    {
        health =50;
        strength = 100;
        score = 0;
    }

    public void actionForWarrior()
    {
       // Warrior ob = new Warrior();
        int x =getStrength();
        setStrength(x+cube());

       // return ob;
    }

    @Override
    public void action() {
       actionForWarrior();}
    
    
    
}
