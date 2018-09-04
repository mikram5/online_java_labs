package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

public class Exercise_04 {

        int a = 35;
        int b = 12;
        int c = 7;

        int addition (int a, int b) {
            return a + b;
        }

        int addition (int a, int b, int c){
            return a + b + c;
        }

        int addition (double a, double b, double c){
            return ((int) (a + b + c));
        }

    }





