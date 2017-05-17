/**
 * An object of class Board represents a game board for the game Elimination,
 * where a pair of dice is rolled and depending on user input, the sum
 * of the numbers of the dice or the two numbers on the die are 'eliminated'
 * from the board.
 *
 * @author  Byron Torres
 * @version 1.0
 * @since   2017-05-16
 */

public class Board {
    private int num[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    private String markers[] = {"*","*","*","*","*","*","*","*","*","*","*","*"};

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
        // Eliminates based on the sum of the two numbers rolled
        if (sumNum < 2 || sumNum > 12) {
            System.err.println("Not a valid move! Re-roll.");
        } else {
            markers[sumNum] = "X";
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
        if (num1 < 1 || num1 > 12) {
            if (num2 < 1 || num2 > 12) {
                System.err.println("Not a valid move! Re-roll.");
            } else {
                markers[num1] = "X";
                markers[num2] = "X";
            }
        } else {
            System.err.println("Not a valid move! Re-roll.");
        }
    }

    /**
     * The toString method creates the board for the game
     * @return String creates the game board
     */

    public String toString() {
        String n = ""; String m = "";
        for(int i = 0; i < num.length; i++) {
            n += num[i] + " ";
            m += markers[i] + " ";
        }
        return n + "\n" + m;
    }
} // end class Board
