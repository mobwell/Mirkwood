/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import java.util.Random;

/**
 *
 * @author davidsanguinetti
 */
public abstract class MapObject {
    TerminalPosition position;
    boolean free;
    boolean visible;
    char symbol;
    TextColor foregroundColor;
    TextColor backgroundColor;
    Random _rand;

    public MapObject(TerminalPosition position, boolean free, boolean visible, char symbol, TextColor foregroundColor, TextColor backgroundColor) {
        this.position = position;
        this.free = free;
        this.visible = visible;
        this.symbol = symbol;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
        
        _rand = new Random();
    }

    public MapObject(TerminalPosition position, boolean free, boolean visible) {
        this.position = position;
        this.free = free;
        this.visible = visible;
    }
    
    

    public TerminalPosition getPosition() {
        return position;
    }

    public void setPosition(TerminalPosition position) {
        this.position = position;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public TextColor getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(TextColor foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public TextColor getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(TextColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    
    
}
