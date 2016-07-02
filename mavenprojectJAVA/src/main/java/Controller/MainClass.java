/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.GameStart;

/**
 *
 * @author Izabela
 */
// zrobic ostatnie okno z podsumowaniem 

public class MainClass {
public static JFrame frame = new JFrame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
     // 
     GameStart test = new GameStart();

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.c

 frame.getContentPane().add(test);

  frame.pack();// odśwież okno
             frame.setLocationRelativeTo(null);
      // a.setVisible(true);
      frame.setVisible(true);
    }
   
}
