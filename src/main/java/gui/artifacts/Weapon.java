/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.Map;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class Weapon extends Misc {
    
    public static final int MAXATTACK = 10;
        
    public Weapon(TerminalPosition pos, int value, int gold, String desc) {
        super(pos, value, gold, desc);
        
        setForegroundColor(TextColor.ANSI.WHITE);
        setBackgroundColor(Map.bkgColor);              
    }        
}
