package generics.labs;

public class GenericMeth<T extends Number> {
    T ob;

    T vals[];

    GenericMeth(T o, T[] nums) {
        ob = o;

        vals = nums;
    }
}

class arrayGen {
    public static void main(String[] args) {
        Integer i[] = {3, 1, 7, 5, 9};

        GenericMeth<?>gen[] = new GenericMeth<?>[2];

        System.out.println(i[4]);
    }
}

