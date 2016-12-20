/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.Map;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import gui.SymbolsMirk;

/**
 *
 * @author davidsanguinetti
 */
public class LayerItem extends MapLayer {
   
    private final int MAXCOINS = 3;
    private final int MAXWEAPONS = 7;

    public LayerItem() {
        spreadCoins();
        spreadWeapons();
    }

    public void spreadCoins() {
        for (int i = 0; i < MAXCOINS; i++) {
            TerminalPosition tpos = new TerminalPosition(_Rand.nextInt(COLUMNS), _Rand.nextInt(LINES));
            int valor = _Rand.nextInt(50);
//            addObject(new Moeda Water(tpos, Water.WaterType.DEEP));
            addObject(new Moeda(valor, tpos, true, true));     
        }
    }
    
    public void spreadWeapons(){
        for (int i = 0; i < MAXWEAPONS; i++) {
            TerminalPosition tpos = new TerminalPosition(_Rand.nextInt(COLUMNS), _Rand.nextInt(LINES));
            int valor = _Rand.nextInt(Weapon.MAXATTACK);
            Math.round(valor * 0.75);
//            addObject(new Moeda Water(tpos, Water.WaterType.DEEP));
            Weapon w = new Weapon(tpos, valor, valor, "Poderosa de " + valor);     
            w.setSymbol(SymbolsMirk.WEAPON[_Rand.nextInt(SymbolsMirk.WEAPON.length)]);  
            addObject(w);
        }        
    }

}
