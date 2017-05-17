/**
 * The Elimination program implements a variation of the
 * game 'Elimination'
 *
 * @author  Byron Torres
 * @version 1.0
 * @since   2017-05-16
 */

import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Board board = new Board();
        PairOfDice dice = new PairOfDice();
        Scanner scan = new Scanner(System.in);
        String userInput;
        System.out.print("Welcome to Elimination!" +
                "\n The dice will be rolled," +
                "\n And the game will proceed from there. \n");
        dice.roll();
        System.out.print("\n Dice 1: " + dice.getDie1() + " \n Dice 2: " + dice.getDie2());
    }
}
