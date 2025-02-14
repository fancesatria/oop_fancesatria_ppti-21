
package tictactoe;

/**
 *
 * @author fance
 */
public class Main {
    
    public Main(){
        Game game = new Game("O", "X"); // set default pemain O dan X
        game.play();
    }

    public static void main(String[] args) {
        new Main();
    }
    
}
