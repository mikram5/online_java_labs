package exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class ThrowPractice {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("Catching exception");
        }
        System.out.println("The exc has been thrown and caught.");
    }
}