/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author fance
 */
public class Board {
    private final char[][] map = {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    
    public void display() {
        for (char[] row : map) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    public boolean setMove(int x, int y, char symbol) {
        if (x < 0 || x >= 3 || y < 0 || y >= 3 || map[x][y] != '-') {
            return false;
        }
        map[x][y] = symbol;
        return true;
    }
    
    public boolean isWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol) ||
                (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol)) {
                return true;
            }
        }
        return (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) ||
               (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol);
    }
    
    public boolean isFull() {
        for (char[] row : map) {
            for (char cell : row) {
                if (cell == '-') return false;
            }
        }
        return true;
    }
}
