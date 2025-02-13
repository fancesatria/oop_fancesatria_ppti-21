
package tictactoe;

/**
 *
 * @author fance
 */
public class main {
    
    public main(){
        Game game = new Game("O", "X"); // set default pemain O dan X
        game.play();
    }

    public static void main(String[] args) {
        new main();
    }
    
}
