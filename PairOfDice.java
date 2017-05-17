/**
 * An object of class PairOfDice represents a pair of dice,
 * where each die shows a number between 1 and 6.  The dice
 * can be rolled, which randomizes the numbers showing on the
 * dice.
 *
 * @author  Byron Torres
 * @version 1.0
 * @since   2017-05-16
 */

public class PairOfDice {

    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.

    /**
     * Constructor.  Rolls the dice, so that they initially
     * show some random values.
     */

    public PairOfDice() {
        roll();  // Call the roll() method to roll the dice.
    }

    /**
     * Roll the dice by setting each of the dice to be
     * a random number between 1 and 6.
     *
     * @return void
     */

    public void roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }

    /**
     * Return the number showing on the first die
     * @return int the number on the first die
     */

    public int getDie1() {
        return die1;
    }

    /**
     * Return the number showing on the second die
     * @return int the number on the second die
     */

    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }

    /**
     * Return the sum of the two integers on the two die
     * @return int the sum of the integers
     */

    public int getTotal() {
        // Return the total showing on the two dice.
        return die1 + die2;
    }

}  // end class PairOfDice
