package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double radius;
        int height;
        double area;

        radius = 3.14;
        height = 5;

        area = (2*3.14*radius*height)+(2*3.14*radius*radius);

        double perimeter;
        double diameter = radius * 2;

        perimeter = 2*(3.14*diameter+height);

        System.out.println("The area of the cylinder is" + area);
        System.out.println("The perimeter of the cylinder is" + perimeter);


    }
}
