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
public interface Strategy {
    public void action();
    
    
}
// przeniesienie strategii do pozimu model
// dorobienie obserwatora, który sprawdza, czy życie gracza lub kompa jest na plusie, jeśli nie, to wywołuje zakończenie gry.