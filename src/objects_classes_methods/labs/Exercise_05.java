package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Shirts tshirt = new Shirts("green");
        Shirts sweatshirt = new Shirts("gray");
        Shirts dress_shirt = new Shirts("blue");

        System.out.println("number of t-shirts: " + tshirt.getNumOfShirts() + " and color of t-shirts: " + tshirt.getColor());
        System.out.println("number of sweatshirts: " + sweatshirt.getNumOfShirts() + " and color of sweatshirts: " + sweatshirt.getColor());
        System.out.println("number of dress_shirts: " + dress_shirt.getNumOfShirts() + " and color of dress shirts: " + dress_shirt.getColor());

    }
}

class Shirts {

    private static int numOfShirts;  //static variable
    private String color;     //non-static variable


    Shirts(String c) {
        numOfShirts++;
        color = c;
    }

    public int getNumOfShirts() {
        return numOfShirts;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
