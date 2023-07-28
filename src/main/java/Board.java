import java.util.Random;
import java.util.Scanner;

public class Board {
    public int board[][] = new int[3][3];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name player 1?");
        String name1 = sc.nextLine();
        System.out.println("Whats your name player 2?");
        String name2 = sc.nextLine();

        double first_go = Math.random();

        System.out.println(first_go);

    }
}
