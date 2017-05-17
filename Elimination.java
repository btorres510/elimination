/**
 * The Elimination program implements a variation of the
 * game 'Elimination'
 *
 * @author Byron Torres
 * @version 1.0
 * @since 2017-05-16
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
                "\n And you can choose to eliminate the sum or both numbers. \n");
        while (!endGame) {
            endGame = board.endOfGame();
            dice.roll();
            System.out.println("Dice 1: " + dice.getDie1());
            System.out.print("Dice 2: " + dice.getDie2());
            boolean inputMatch = false;
            do {
                try {
                    System.out.print("\n Do you want to eliminate the sum or the two numbers?" +
                            "\n Enter 's' for sum, 'b' for both numbers: ");
                    userInput = scan.next();
                    if (userInput.equalsIgnoreCase("s")) {
                        board.sum(dice.getTotal());
                        inputMatch = true;
                    } else if (userInput.equalsIgnoreCase("b")) {
                        board.bothDie(dice.getDie1(), dice.getDie2());
                        inputMatch = true;
                    } else {
                        throw new InputMismatchException("Enter either 's' or 'b'");
                    }
                } catch (InputMismatchException ime) {
                    String garbage = scan.nextLine();
                    System.out.print("\n Do you want to eliminate the sum or the two numbers?" +
                            "\n Enter 's' for sum, 'b' for both numbers: ");
                    userInput = scan.next();
                }
            } while(!inputMatch);
            
            System.out.println("\n" + board);
            System.out.println("Score: " + board.getScore() + "\n");
        }

        System.out.println("Game has ended!" +
                "\n Final score: " + board.getScore() +
                "\n Final die 1 value: " + dice.getDie1() + "\n Final die 2 value: " + dice.getDie2() +
                "\n Final board: ");
        System.out.println("\n" + board);

    }
}
