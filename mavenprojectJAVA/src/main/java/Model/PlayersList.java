/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Izabela
 */
// tworzenie list graczy - potrzebne  na wymogi singletonu, oraz w przypadku rozwinięcia gry do wiekszej liczby użytkowników
public class PlayersList {
  public LinkedList<Warrior> warriors= new LinkedList<>();
  public LinkedList<Wizard> wizards= new LinkedList<>();
public LinkedList<Doctor> doctors= new LinkedList<>();


    
}
