/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;

/**
 *
 * @author Izabela
 */
public class Player {
    int health;
    int strength;
    int score;
    public int getHealth() {return health;}
    public int getStrength() {return strength;}
    public int getScore() {return score;}
    public void setHealth(int _health) {health=_health;}
    public void setStrength(int _strength) {strength=_strength;}
    public void setScore(int _score) {score=_score;}
    public void Fight()
    {
    
    }
    
    public void Defend()
    {
    }
    public int cube()
    {
        Random generator = new Random();
        return 2*(generator.nextInt(6) + 1);// czyli dwa rzuty kostką dla każdego z zawodnikow
    }
    public void actionAgainstDoctor()
    {
        //Doctor ob = new Doctor();
        int y = getHealth();
        setHealth(y-cube());
        //return ob;
    }
    
    
    public void actionAgainstWizard()// ma dodatkowy rzut kostką, może osłabiać i zdrowie i siłe, ale połowicznie
    {
        //Wizard ob2 = new Wizard();
        int l= getStrength();
        setStrength((int)(l-cube())/2);
       // return ob2;
    }
    
    public void actionAgainstWarrior()
    {
        int y = getStrength();
        setHealth(y-cube());
        //return ob;
    }
}
