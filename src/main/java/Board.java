import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Board {
    public char board[][] = new char[3][3];

    public void initialiseBoard() {
        for (int i = 0; i< board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard(){
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
