package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */

public class FruitMain {

    public static void main(String[] args) {

        //create an object from Fruit1 class
        Fruit1 apple = new Fruit1("red", 80);

        String str = apple.colorMeth("red");
        int val = apple.weightMeth(85);

        Vegetable carrot = new Vegetable(0);
        carrot.setSeedCount(1);
        System.out.println(carrot.getSeedCount());
    }
}







