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

    public void selectBoardPosition(){
        

        System.out.println("What position on the board do you want to go, " +
                "select which row, from 1) Middle, 2) Top and 3) Bottom");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        System.out.println("What position on the board do you want to go, " +
                "select which row, from 1) Middle, 2) left and 3) right");
        int choice2 = sc.nextInt();

        switch (choice1){
            case 1:
                x = Coordinate.MIDDLE;
                break;
            case 2:
                x = Coordinate.TOP;
                break;
            case 3:
                x = Coordinate.BOTTOM;
                break;
        }

        switch (choice2){
            case 1:
                y = Coordinate.MIDDLE;
                break;
            case 2:
                y = Coordinate.LEFT;
                break;
            case 3:
                y = Coordinate.RIGHT;
                break;
        }



    }
}
