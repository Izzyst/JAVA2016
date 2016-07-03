package testy;

import Controller.*;
import static Controller.ControllerPlayer.players;
import static Controller.MainClass.frame;
import Model.*;
import javax.swing.JFrame;
import view.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Izabela
 */
public class ClassTests {
    
    public ClassTests() {
    }
    
    // sprawdza czy poprawnie wykonuje się akcja kontrolera
   @Test
    public void ControllerPlayerTest()
    {
        ControllerPlayer ob = new ControllerPlayer();
        ControllerPlayer.a = 2;// okreslenie kim jest komputer
        ob.action(1);// 1- ustawienie kim jest gracz
        Wizard wiz = new Wizard();
        Assert.assertNotNull(players.wizards.get(0));// sprawdza, czy został utowrzony obiekt czarodzieja poprawie
        Assert.assertNotNull(players.warriors.get(0));// spr czy poprawinie generuje się nowy obiekt
    }
    
    @Test
    public void testPlayerGet()
    {
        int a = 10;
        Player ob = new Player();
        ob.setHealth(10);
        int value = ob.getHealth();
        Assert.assertEquals(value, a);
    }
    
    // zrobić testowanie dla nazw czy poprawnie sie wyswietla lekarz, czarodziej, wojownik
   @Test
    public void nameTest()
    {
        // 0 - doctor
        // 1 - warrior
        // 2 - wizard
        BattleView ob = new BattleView();       
        Assert.assertEquals("lekarz", ob.playerName(0));
        Assert.assertEquals("wojownik", ob.playerName(1));
        Assert.assertEquals("czarodziej", ob.playerName(2));
   
    }
    
    // sprawdzanie działania obserwatora - aktualizacji
    @Test
    public void actualizationTest()
    {
        Warrior ob = new Warrior();
        Doctor ob2 = new Doctor();
        Wizard ob3 = new Wizard();
        Obserwator obserw = new Obserwator();
        Assert.assertTrue(obserw.actualization(ob));//true zwraca w przypadku gdy obieekt wciąż ma punkty życia
        Assert.assertTrue (obserw.actualization(ob2));
        Assert.assertTrue (obserw.actualization(ob3));
    }
    
    
    // spr czy okno startu jest włączone
    @Test
    public void isVisibleTest()
    {
        //GameStart ob = new GameStart();
        //frame.getContentPane().add(ob);
        MainClass ob = new MainClass();
        MainClass.callFrame();
        Assert.assertEquals(true, frame.isVisible());
    
    }


}
