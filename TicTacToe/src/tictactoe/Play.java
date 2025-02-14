
package tictactoe;
/**
 *
 * @author fance
 */
import java.util.*;
public class Play {
    private int play = 0, count_block = 0, flag = 0;
    private int x, y;
    private final Scanner scan = new Scanner(System.in);
    private final char map[][] = {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    
    public void view_map(){
        for(int i = 0;i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(""+map[i][j]);
            }
            System.out.println();
        }
    }
    
    public void show_message(){
        System.out.println("Enter -1 -1 to stop");
        do{
            view_map();
            System.out.print("Player "+(play+1)+" move [1-3] row and col : ");
            x = scan.nextInt();
            y = scan.nextInt();
            x--; y--;
            if(x == -1 && y == -1) break;
            
            if(!(map[x][y] == '-')){
                System.out.println("Block is filled, try another block");
            } else if(!(x >= 0 && x <=2 || y >= 0 && y <= 2)) {
                System.out.println("Out of bounds");
            } else {
                if(play == 0)map[x][y] = 'O';
                else if(play == 1) map[x][y] = 'X';
                
                if(isWin(map[x][y], play)) {
                    flag = 1;
                    break;
                }
                
                play++; count_block++;
                play %= 2;
            }
            
        }while(count_block < 9);
        view_map();
        if(flag == 1) System.out.println("+++ Player " +play+" is win +++");
        System.out.println("=== Thanks for playing ===");
    }
    
    public boolean isWin(char temp, int player){
        // Cek horizontal dan vertikal
        for(int i = 0; i < 3; i++){
            // Cek baris
            if(map[i][0] == temp && map[i][1] == temp && map[i][2] == temp) return true;
            // Cek kolom
            if(map[0][i] == temp && map[1][i] == temp && map[2][i] == temp) return true;
        }

        // Diagonal utama
        if(map[0][0] == temp && map[1][1] == temp && map[2][2] == temp) return true;

        // Diagonal biasa
        if(map[0][2] == temp && map[1][1] == temp && map[2][0] == temp) return true;
        return false;
    }
}