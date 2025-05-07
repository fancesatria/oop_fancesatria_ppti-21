/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dungeon;

import player.Enemy;
import player.HP;
import player.Player;

/**
 *
 * @author fance
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Player player = new Player ("Admium", new HP(100), 10, 3);

            Enemy[] enemies = {
                            new Enemy("Slime", new HP(10), 2, 0)
                            , new Enemy("Goblin", new HP(20), 5, 2)
                            , new Enemy("Golem", new HP(50), 5, 10)
            };

            player.attack(enemies[0]);
            enemies[0].showHP();

            enemies[0].attack(enemies[1]);
            enemies[1].showHP();

            enemies[0].attack(enemies[2]);
            enemies[2].showHP();
	}
    
}
