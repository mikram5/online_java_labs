package generics.labs;

public class GenPracDemo {
    public static void main(String[] args) {

        GenPractice<Integer, String> gpObj =
                new GenPractice<Integer, String>(34, "Generics Practice");

        GenPractice<Double, String> gpObj2 =
                new GenPractice<Double, String>(4.5, "more practice");

        gpObj.paramTypes();

        int i = gpObj.getOb1();
        System.out.println("value = " + i);

        String s = gpObj.getOb2();
        System.out.println("value = " + s);

        gpObj2.paramTypes();

        double dub = gpObj2.getOb1();
        System.out.println();

        String str = gpObj2.getOb2();
        System.out.println("value = " + str);
    }
}
