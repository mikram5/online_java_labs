package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args)
        throws java.io.IOException {
        // write code here
        String s;

        System.out.println("Enter your name: ");

        s = (String) System.in.read();

        String sub = s.substring(1, 15);

        System.out.println(sub + "ay");

    }
}


