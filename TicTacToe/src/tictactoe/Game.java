/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author fance
 */
import java.util.*;
public class Game {
    private final Board board = new Board();
    private final Player player1, player2;
    private Player currentPlayer;
    private final Scanner scan = new Scanner(System.in);
    
    public Game(String name1, String name2) {
        player1 = new Player(name1, 'O');
        player2 = new Player(name2, 'X');
        currentPlayer = player1;
    }
    
    public void play() {
        System.out.println("=== Tic Tac Toe ===");
        System.out.println("Enter -1 -1 to stop");
        
        while (true) {
            board.display();
            System.out.print(currentPlayer.getName() + "'s move [1-3] row and col: ");
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            
            if (x == -2 && y == -2) break;
            
            if (!board.setMove(x, y, currentPlayer.getCharacter())) {
                System.out.println("Invalid move, try again!");
                continue;
            }
            
            if (board.isWin(currentPlayer.getCharacter())) {
                board.display();
                System.out.println("+++ " + currentPlayer.getName() + " wins! +++");
                break;
            }
            
            if (board.isFull()) {
                board.display();
                System.out.println("=== It's a draw! ===");
                break;
            }
            
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        System.out.println("=== Thanks for playing ===");
    }
}
