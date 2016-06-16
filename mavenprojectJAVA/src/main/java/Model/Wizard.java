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
public class Wizard extends Player implements Strategy{
    
    public Wizard()
    {
        health =70;
        strength = 30;
        score =0;     
    }

 
    
    public void actionForWizard()// ma dodatkowy rzut kostką, może osłabiać i zdrowie i siłe, ale połowicznie
    {
       // Wizard ob = new Wizard();
        int x = getHealth();
        setHealth(x+cube());      
        int k = getStrength();
        setStrength((x+cube())/2);

       // return ob;
    }
}
