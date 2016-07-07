/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Player;

/**
 *
 * @author Izabela
 */
public class Obserwator {
    public Boolean actualization(Player gracz)
    {
        if (gracz.getHealth() > 0) return true;
        else return false;
    }
}
