/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;

/**
 *
 * @author Trainerpl022
 */
public class Misc extends MapObject {
    int value,
          gold;
    String desc;
    
    

    public Misc(TerminalPosition pos, int value, int gold, String desc) {
        super(pos, true, true);
        this.value = value;
        this.gold = gold;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
