/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import view.*;
import java.util.Random;
import static javafx.beans.binding.Bindings.or;

// poprawić walke - żeby winiki z metod against były do odpowiedniego gracza przypisane
// połączyć controler z widokiem
//poprawić tworzenie obiektów walczących, żby były brane z listy
public class ControllerPlayer {
   public static PlayersList players= null;
  public static int a;
   
  //wzorzec singleton 
  public void ControllerPlayer()
  {
      if(players == null) players = new PlayersList();// tworzy całą lisę graczy za pomocą klasy PlayersList, jeśli null
  }
    
    public int comp()// losuje czym jest komputer
    {
        Random generator = new Random();
        return generator.nextInt(3);
    }
   
  /*  public void checkNumber(int number)
    {
        
    }
   */ 
    public void action(int number)
    {   
        // 0 - doctor
        // 1 - warrior
        // 2 - wizard
        
        Obserwator obserw = new Obserwator();// obiekt obserwatora, który kontroluje, czy dany użytkownik ma jeszcze punkty życia
        a=comp();
        if(number == a )
        {
                // System.out.println("Remis!!!");

        }
        else if(number==0 && a==1)
        {
           players.lista2.add( new Doctor());
            players.lista2.get(0).action();
            Warrior comp = new Warrior();
            comp.action();
            comp.actionAgainstDoctor();
            players.lista2.get(0).actionAgainstWarrior();
            if(obserw.actualization(players.lista2.get(0)) == false || obserw.actualization(comp) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();
            
        }  
        else if(number==1 && a==2)
        {
           Warrior gracz = new Warrior();
           gracz.action();
           Wizard comp = new Wizard();
           comp.action();
           comp.actionAgainstWarrior();
           gracz.actionAgainstWizard();
            if(obserw.actualization(gracz) == false || obserw.actualization(comp) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();

        }
        else if(number==2 && a==0)
        {
           Wizard gracz = new Wizard();
           gracz.action();
           Doctor comp = new Doctor();
           comp.action();
           comp.actionAgainstWizard();
           gracz.actionAgainstDoctor();
           if(obserw.actualization(gracz) == false || obserw.actualization(comp) == false)// obserwator sprawdza czy dany gracz ma jeszcze życie
                new SummationView();

        }
        else if(number==1 && a==0)
        {
           Warrior gracz = new Warrior();
           gracz.action();
           Doctor comp = new Doctor();
           comp.action();
           gracz.actionAgainstDoctor();
           comp.actionAgainstWarrior();
            if(obserw.actualization(gracz) == false || obserw.actualization(comp) == false)// obserwator sprawdza czy dany gracz ma jeszcze życie
                // jeśli nie, zostaje wyświetlone okno z podsumowanim
                //wywołanie okna z podsumowaniem 
                new SummationView();

        }
        else if(number==2 && a==1)
        {
           Wizard gracz = new Wizard();
           gracz.action();
           Warrior comp = new Warrior();
           comp.action();
           gracz.actionAgainstWarrior();
           comp.actionAgainstWizard();
            if(obserw.actualization(gracz) == false || obserw.actualization(comp) == false)
                //wywołanie okna z podsumowaniem
                System.out.println("");
        }
        else if(number==0 && a==2)
        {
           Doctor gracz = new Doctor();
           gracz.action();
           Wizard comp = new Wizard();
           comp.action();
           gracz.actionAgainstWizard();
           comp.actionAgainstDoctor();
           if(obserw.actualization(gracz) == false || obserw.actualization(comp) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();  
        }


    }
}
