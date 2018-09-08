package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class TryCatch2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;

        TryCatch2 val = new TryCatch2();
        val.divide(8, 0);

    }

    public int divide(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException exc) {
            System.out.println("Division by zero not allowed");
            return 0;
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Index is out of bounds");
            return 0;
        } finally {
            System.out.println("You're done!");
        }
    }
}




