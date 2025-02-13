/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author fance
 */
public class Player {
    private final String name;
    private final char character;
    
    public Player(String name, char character){
        this.name = name;
        this.character = character;
    }
    
    public String getName(){
        return name;
    }
    
    public char getCharacter(){
        return character;
    }
}
