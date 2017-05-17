/**
 * An object of class Board represents a game board for the game Elimination,
 * where a pair of dice is rolled and depending on user input, the sum
 * of the numbers of the dice or the two numbers on the die are 'eliminated'
 * from the board.
 *
 * @author Byron Torres
 * @version 1.0
 * @since 2017-05-16
 */

public class Board {
    private int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private String markers[] = {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"};

    public Board() {

    }

    /**
     * This method is used to add the two dice integers,
     * and eliminate that number. Elimination is shown by
     * changing the asterisk to an 'X'.
     *
     * @param sumNum The sum on the two integers from the die
     * @return void
     */

    public void sum(int sumNum) {
        if (sumNum < 2 || sumNum > 12) {
            System.err.println("Not a valid move! Re-roll.");
        } else {
            markers[sumNum - 1] = "X";
        }
    }

    /**
     * This method is used to eliminate two integers,
     * the two integers found on die 1 and die 2.
     *
     * @param num1 The first integer from die 1
     * @param num2 The second integer from die 2
     * @return void
     */

    public void bothDie(int num1, int num2) {
        if (num1 == num2) {
            sum(num1 + num2);
        } else if (num1 < 0 || num1 > 12) {
            System.err.println("Not a valid move! Re-roll.");
        } else {
            if (num2 < 0 || num2 > 12) {
                System.err.println("Not a valid move! Re-roll.");
            } else {
                markers[num1 - 1] = "X";
                markers[num2 - 1] = "X";
            }
        }
    }

    /**
     * Returns the current score of the game
     *
     * @return int the current score
     */

    public int getScore() {
        int score = 0;
        for (int i = 0; i < markers.length; i++) {
            if (markers[i].equals("*")) {
                score += num[i];
            }
        }
        return score;
    }

    /**
     * Checks the current markers to determine
     * if the game has ended
     *
     * @return boolean Returns true if the user's current roll cannot eliminate any number
     */

    public boolean endOfGame() {
        PairOfDice diceEnd = new PairOfDice();
        diceEnd.roll();
        for (int i = 0; i < num.length; i++) {
            if (markers[diceEnd.getTotal()].equals("X") ||
                    (markers[diceEnd.getDie1()].equals("X") && markers[diceEnd.getDie2()].equals("X"))) {
                return true;
            }
        }
        return false;
    }

    /**
     * The toString method creates the board for the game
     *
     * @return String creates the game board
     */

    public String toString() {
        String row1 = new String();
        String row2 = new String();
        for (int i = 0; i < num.length; i++) {
            row1 = row1 + num[i] + "\t";
            row2 = row2 + markers[i] + "\t";
        }
        return row1 + "\n" + row2;
    }
} // end class Board
