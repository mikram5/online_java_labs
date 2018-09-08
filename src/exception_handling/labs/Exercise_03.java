package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class TryFinallyEx {

    public static void main(String[] args) {

        int [] numer = { 4, 8, 16, 32, 64, 128};
        int [] denom = { 2, 0, 8, 0};

        for(int i=0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " +
                        numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Can't divide by zero.");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching element found.");
            }
            finally {
                System.out.println("It's over.");
            }
        }
    }
}