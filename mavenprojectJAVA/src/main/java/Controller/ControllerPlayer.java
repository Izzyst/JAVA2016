/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.Random;

// poprawić walke - żeby winiki z metod against były do odpowiedniego gracza przypisane
public class ControllerPlayer {
    
    public int comp()// losuje czym jest komputer
    {
        Random generator = new Random();
        return generator.nextInt(3);
    }
   
    public void checkNumber(int number)
    {
        
    }
    
    public void action(int number)
    {   
        // 0 - doctor
        // 1 - warrior
        // 2 - wizard

        
        int a=comp();
        if(number == a )
        {
                // System.out.println("Remis!!!");

        }
        else if(number==0 && a==1)
        {
           Doctor gracz = new Doctor();
           gracz.actionForDoctor();
            Warrior comp = new Warrior();
            comp.actionForWarrior();
            comp.actionAgainstDoctor();
            gracz.actionAgainstWarrior();

            
        }  
        else if(number==1 && a==2)
        {
           Warrior gracz = new Warrior();
           gracz.actionForWarrior();
           Wizard comp = new Wizard();
           comp.actionForWizard();
           comp.actionAgainstWarrior();
           gracz.actionAgainstWizard();


        }
        else if(number==2 && a==0)
        {
           Wizard gracz = new Wizard();
           gracz.actionForWizard();
           Doctor comp = new Doctor();
           comp.actionForDoctor();
           comp.actionAgainstWizard();
           gracz.actionAgainstDoctor();


        }
        else if(number==1 && a==0)
        {
           Warrior gracz = new Warrior();
           gracz.actionForWarrior();
           Doctor comp = new Doctor();
           comp.actionForDoctor();
           gracz.actionAgainstDoctor();
           comp.actionAgainstWarrior();


        }
        else if(number==2 && a==1)
        {
           Wizard gracz = new Wizard();
           gracz.actionForWizard();
           Warrior comp = new Warrior();
           comp.actionForWarrior();
           gracz.actionAgainstWarrior();
           comp.actionAgainstWizard();

        }
        else if(number==0 && a==2)
        {
           Doctor gracz = new Doctor();
           gracz.actionForDoctor();
           Wizard comp = new Wizard();
           comp.actionForWizard();
           gracz.actionAgainstWizard();
           comp.actionAgainstDoctor();
                  
        }
    
    }
}
