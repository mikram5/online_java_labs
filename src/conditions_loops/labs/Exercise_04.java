package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        double num;

        for(num = 1; num < 101; num++) {
            if (num % 2 == 0)
            System.out.println(num);
        }
    }
}
