package exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class CustomException extends Exception {
    int n;
    int d;

    CustomException(int i, int b) {
        n = i;
        d = b;
    }

    public String toString() {
        return n + " / " + d + " is not an integer.";
    }
}

class CustExceptPractice {
    public static void main(String[] args) {

        int numer[] = { 2, 8, 11 };
        int denom[] = { 2, 4, 3};

        for(int i=0; i < numer.length; i++) {
            try {
                if(numer[i]%2 != 0)
                    throw new
                            CustomException(numer[i], denom[i]);
            }
            catch (CustomException exc) {
                System.out.println(exc);
            }
        }

    }

}