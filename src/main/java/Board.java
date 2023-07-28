import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    public char board[][] = new char[3][3];

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
        int choice1 = checkValidInput();
        int choice2 = checkValidInput();

        if (player1.isTurn()) {
            if (board[choice1 - 1][choice2 - 1] == '-') {
                board[choice1 - 1][choice2 - 1] = 'X';
                player1.changeTurn();
                player2.changeTurn();
            } else {
                System.out.println("That position is already taken try again");
            }
        } else {
            if (board[choice1 - 1][choice2 - 1] == '-') {
                board[choice1 - 1][choice2 - 1] = 'O';
                player1.changeTurn();
                player2.changeTurn();
            } else {
                System.out.println("That position is already taken try again");
            }
        }

        if(player1.isTurn()) {
            System.out.println("It is " + player1.getName()+ "'s turn");
        } else {
            System.out.println("It is " + player2.getName() + "'s turn");
        }

        printBoard();
    }

    private int checkValidInput() {
        Scanner sc = new Scanner(System.in);
        boolean isNumeric = false;
        int choice = 0;

        while(!isNumeric) {
            try {
                System.out.println("What position on the board do you want to go, " +
                        "select which row, from (1) Top, (2) Middle and (3) Bottom");
                choice = sc.nextInt();
                sc.nextLine();
                isNumeric = true;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid character found. Please enter the number 1, 2 or 3");
                sc.nextLine();
            }
        }

        return choice;
    }


    public boolean checkRowWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]
                    && (board[i][0] != '-') && (board[i][1] != '-') && (board[i][2] != '-')) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]
                    && (board[0][i] != '-') && (board[1][i] != '-') && (board[2][i] != '-')) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagWin() {
        for (int i = 0; i < board.length; i++) {
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
                    && (board[2][2] != '-') && (board[1][1] != '-') && (board[2][2] != '-')) {
                return true;
            }
        }
        return false;
    }

    public boolean checkBoardFull() {
        int emptySpaces = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    emptySpaces++;
                }
            }
        }

        if (emptySpaces == 0) {
            return true;
        } else {
            return false;
        }
    }
}
