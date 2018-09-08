package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exception1 {
    static void newException() {
        int[] someArray = new int[6];

        System.out.println("This works.");

        someArray[7] = 3;
    }
}

class TryClassDemo {
    public static void main(String[] args) {

        try {
            Exception1.newException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out of bounds.");
        }
    }
}