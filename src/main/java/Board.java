import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Board {
    public char board[][] = new char[3][3];
    Person person = new Person();

    public void initialiseBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
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

    public void selectBoardPosition(Person player1, Person player2) {
        System.out.println("What position on the board do you want to go, " +
                "select which row, from 1) Top, 2) Middle and 3) Bottom");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        System.out.println("What position on the board do you want to go, " +
                "select which column, from 1) Left, 2) Middle and 3) Right");
        int choice2 = sc.nextInt();

        if (player1.isTurn()) {
            if (board[choice1 - 1][choice2 - 1] == '-') {
                board[choice1 - 1][choice2 - 1] = 'X';
            } else {
                System.out.println("That position is already taken try again");
            }
        } else {
            if (board[choice1 - 1][choice2 - 1] == '-') {
                board[choice1 - 1][choice2 - 1] = 'O';
            } else {
                System.out.println("That position is already taken try again");
            }
        }
        printBoard();
    }

    // fix these
    public boolean checkRowWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][2] != '-') {
                return true;
            }
        }
        return false;
    }

    public boolean checkColWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[2][i] != '-') {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[2][2] != '-' ) {
                return true;
            }
        }
        return false;
    }

}
