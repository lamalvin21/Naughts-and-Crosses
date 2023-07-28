import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person player1 = new Person();
        Person player2 = new Person();

        System.out.println("Whats your name player 1?");
        String name1 = sc.nextLine();
        player1.setName(name1);

        System.out.println("Whats your name player 2?");
        String name2 = sc.nextLine();
        player2.setName(name2);

        player1.changeTurn();

        Board board = new Board();
        board.initialiseBoard();
        board.printBoard();

        while (true) {
            board.selectBoardPosition(player1, player2);
            player1.changeTurn();
            player2.changeTurn();

            if (board.checkDiagWin() || board.checkRowWin() || board.checkColWin()) {
                if (!player1.isTurn() == true) {
                    System.out.println(player1.getName() + " has won!");
                    break;
                } else{
                    System.out.println(player2.getName()  + " has won!");
                    break;
                }
            }
        }
    }
}
