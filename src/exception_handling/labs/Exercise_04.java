package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class NestExample {
    public static void main(String[] args) {
        int numer [] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom [] = { 2, 0, 4, 3, 0, 8 };

        try {
            for(int i=0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " +
                            denom[i] + " is " +
                            numer[i]/denom[i]);
                }
                catch (ArithmeticException exc) {
                    System.out.println("Can't divide by 0.");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
        }
    }
}