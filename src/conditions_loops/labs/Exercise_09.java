package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        int num;
        int i;

        num = 20;

        for (i = 0; i < num; i++) {
            if(i + 2 >= num) break;
            System.out.println(i + " ");
        }
        System.out.println("Done");
    }
}
