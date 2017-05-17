/**
 * The Elimination program implements a variation of the
 * game 'Elimination'
 *
 * @author  Byron Torres
 * @version 1.0
 * @since   2017-05-16
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Board board = new Board();
        PairOfDice dice = new PairOfDice();
        Scanner scan = new Scanner(System.in);
        boolean endGame = false;
        String userInput;
        System.out.println("Welcome to Elimination!" +
                "\n The dice will be rolled," +
                "\n And the game will proceed from there. \n");
        while(!endGame) {
            dice.roll();
            System.out.println("Dice 1: " + dice.getDie1());
            System.out.print("Dice 2: " + dice.getDie2());
            endGame = board.endOfGame();
            try {
                System.out.print("\n Do you want to eliminate the sum or the two numbers?" +
                        "\n Enter 's' for sum, 'b' for both numbers: ");
                userInput = scan.next();
                if (userInput.equalsIgnoreCase("s")) {
                    board.sum(dice.getTotal());
                } else if (userInput.equalsIgnoreCase("b")) {
                    board.bothDie(dice.getDie1(), dice.getDie2());
                } else {
                    throw new InputMismatchException("Enter either 's' or 'b'");
                }
            } catch (InputMismatchException ime) {
                ime.printStackTrace();
            }
            System.out.println("\n" + board);
            System.out.println(board.getScore() + "\n");
        }
    }
}
