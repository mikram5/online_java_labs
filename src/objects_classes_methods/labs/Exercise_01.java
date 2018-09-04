package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

//Controller class
class BeerController {
    public static void main(String[] args) {
        BeerStyle1 stout = new BeerStyle1(5.6, 35, 16);
        BeerStyle2 gose = new BeerStyle2(4.5, 25, 12);
    }
}
class BeerStyle1 {
    double abv;  //percentage of alcohol
    int ibu;     //level of bitterness
    int volume;  //amount in vessel


    //BeerStyle1 constructor
    BeerStyle1(double a, int i, int v) {
        abv = a;
        ibu = i;
        volume = v;
    }
}
class BeerStyle2 {
    double abv;
    int ibu;
    int volume;

    //BeerStyle2 constructor
    BeerStyle2(double a, int i, int v) {
        abv = a;
        ibu = i;
        volume = v;
    }
}



