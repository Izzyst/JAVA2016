/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.Random;

// poprawic funkcje against 
// wrzucic te funkcje do modelu, żeby nie zasmiecac controllera

/**
 *
 * @author Izabela
 */
public class ControllerPlayer {
    
    public int comp()// losuje czym jest komputer
    {
        Random generator = new Random();
        return generator.nextInt(3);
    }
    
    public int cube()
    {
        Random generator = new Random();
        return 2*(generator.nextInt(6) + 1);// czyli dwa rzuty kostką dla każdego z zawodnikow
    }
    
    public Doctor actionForDoctor(Player ob2)
    {
        
        Doctor ob = new Doctor();
        int x = ob.getHealth();
        ob.setHealth(x+cube());
        int y = ob2.getHealth();
        ob2.setHealth(y-cube());
        return ob;
    }
    
    public Wizard actionForWizard(Player ob2)// ma dodatkowy rzut kostką, może osłabiać i zdrowie i siłe, ale połowicznie
    {
        Wizard ob = new Wizard();
        int x = ob.getHealth();
        ob.setHealth(x+cube());
        int y = ob2.getHealth();
        ob2.setHealth((int)(y-cube())/2);
        
        int k = ob.getStrength();
        ob.setStrength((x+cube())/2);
        int l= ob2.getStrength();
        ob2.setStrength((int)(y-cube())/2);
        return ob;
    }
    
     public Wizard actionAgainstWizard(Player ob2)// ma dodatkowy rzut kostką, może osłabiać i zdrowie i siłe, ale połowicznie
    {
        Wizard ob = new Wizard();
        int x = ob.getHealth();
        ob.setHealth(x+cube());
        int y = ob2.getHealth();
        ob2.setHealth((int)(y-cube())/2);
        
        int k = ob.getStrength();
        ob.setStrength((x+cube())/2);
        int l= ob2.getStrength();
        ob2.setStrength((int)(y-cube())/2);
        return ob;
    }
    
    public Warrior actionForWarrior(Player ob2)
    {
        Warrior ob = new Warrior();
        int x = ob.getStrength();
        ob.setStrength(x+cube());

        return ob;
    }
    
    public void actionAgainstWarrior(Warrior ob2)
    {
        int y = ob2.getStrength();
        ob2.setHealth(y-cube());
        //return ob;
    }
    
    public void checkNumber(int number)
    {
        
    }
    
    public void action(int number)
    {   
        // 0 - doctor
        // 1 - warrior
        // 2 - wizard
        Player gracz = new Player();
        Player comp = new Player();
        
       // if(number)
        
        int a=comp();
        if(number == a )
        {
                // System.out.println("Remis!!!");

        }
        else if(number==0 && a==1)
        {
            gracz = actionForDoctor(comp);
            comp = actionForWarrior(gracz);
                  //System.out.println("Wygrales/las!!! Papier zawija kamien!");
                  //osoba.wynik[0]++;
            Doctor ob1 = new Doctor();
            
        }  
        else if(number==1 && a==2)
        {
            gracz = actionForDoctor(comp);
            comp = actionForWarrior(gracz);
                  //System.out.println("Wygrales/las!!! Kamien niszczy nozyce!");
                  //osoba.wynik[0]++;
        }
        else if(number==2 && a==0)
        {
            gracz = actionForDoctor(comp);
            comp = actionForWarrior(gracz);
                  //System.out.println("Wygrales/las!!! Nozyce tna papier!");
                  //osoba.wynik[0]++;
        }
        else if(number==1 && a==0)
        {
            gracz = actionForDoctor(comp);
            comp = actionForWarrior(gracz);
                  //System.out.println("Przegrales/las!!! Papier zawija kamien!");
                  //osoba.wynik[1]++;
        }
        else if(number==2 && a==1)
        {
            gracz = actionForWizard(comp);
            comp = actionForWarrior(gracz);
                  //System.out.println("Przegrales/las!!! Kamien niszczy nozyce!");
                  //osoba.wynik[1]++;
        }
        else if(number==0 && a==2)
        {
            gracz = actionForDoctor(comp);
            comp = actionForWizard(gracz);
                  
        }
    
    }
}
