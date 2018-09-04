package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

public class Exercise_02 {

    // 1) static method calling another static method
    public static void main(String[] args) {

        int a = 7;
        int b = 10;
        int result = b-a;

        staticMethod();


        // 2) calling a non-static method
        Exercise_02 se = new Exercise_02();
        se.nonStaticMethod();
        int val = se.method2(10, 30);

        double num = se.divide(40.3, 15.5);

        String str = se.concat("blue", "house");
    }

    public static void staticMethod() {
        System.out.println("static method");
    }

    public void nonStaticMethod() {
        System.out.println("non-static method");
    }


    // 3) non-static calls another non-static, method2 returns a value to method1
    public void method1() {

        System.out.println(method2(5, 7));
    }

    public int method2(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;

    }

    public String concat(String a, String b) {
        return a+"-"+b;
    }
}










