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
// stworzyc odpowiednie wywoływanie battleView
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
            players.doctors.add( new Doctor());
            players.doctors.get(0).action();
            players.warriors.add(new Warrior());
            players.warriors.get(0).action();

            players.warriors.get(0).actionAgainstDoctor();
            players.doctors.get(0).actionAgainstWarrior();
            if(obserw.actualization(players.doctors.get(0)) == false || obserw.actualization(players.warriors.get(0)) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();
            
        }  
        else if(number==1 && a==2)
        {
            
            // czarodziej przeciwko wojownikowi
            players.wizards.add( new Wizard());
            players.wizards.get(0).action();
            
            players.warriors.add(new Warrior());
            players.warriors.get(0).action();

            players.warriors.get(0).actionAgainstWizard();
            players.wizards.get(0).actionAgainstWarrior();
            if(obserw.actualization(players.wizards.get(0)) == false || obserw.actualization(players.warriors.get(0)) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();

        }
        else if(number==2 && a==0)
        {
            // czarodziej przeciw doktorowi
            players.wizards.add( new Wizard());
            players.wizards.get(0).action();
            
            players.doctors.add(new Doctor());
            players.doctors.get(0).action();

            players.doctors.get(0).actionAgainstWizard();
            players.wizards.get(0).actionAgainstDoctor();
            if(obserw.actualization(players.wizards.get(0)) == false || obserw.actualization(players.doctors.get(0)) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();
            

        }
        else if(number==1 && a==0)
        {
           // wojownik przeciw doktorowi
 
            players.warriors.add( new Warrior());
            players.warriors.get(0).action();
            
            players.doctors.add(new Doctor());
            players.doctors.get(0).action();

            players.doctors.get(0).actionAgainstWarrior();
            players.warriors.get(0).actionAgainstDoctor();
            if(obserw.actualization(players.warriors.get(0)) == false || obserw.actualization(players.doctors.get(0)) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();

        }
        
        else if(number==2 && a==1)
        {
            // czarodziej przeciw wojownikowi
            players.warriors.add( new Warrior());
            players.warriors.get(0).action();
            
            players.wizards.add(new Wizard());
            players.wizards.get(0).action();

            players.wizards.get(0).actionAgainstWarrior();
            players.warriors.get(0).actionAgainstWizard();
            if(obserw.actualization(players.warriors.get(0)) == false || obserw.actualization(players.wizards.get(0)) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();
        }
        
        else if(number==0 && a==2)
        {
            // czarodziej przeciw doktorowi
 
            players.wizards.add( new Wizard());
            players.wizards.get(0).action();
            
            players.doctors.add(new Doctor());
            players.doctors.get(0).action();

            players.doctors.get(0).actionAgainstWizard();
            players.wizards.get(0).actionAgainstDoctor();
            if(obserw.actualization(players.wizards.get(0)) == false || obserw.actualization(players.doctors.get(0)) == false)
                //wywołanie okna z podsumowaniem
                new SummationView();
        }


    }
}
