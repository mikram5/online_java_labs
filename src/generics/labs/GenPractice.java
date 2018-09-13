package generics.labs;

public class GenPractice <A, B> {
    A ob1;
    B ob2;

    GenPractice(A o1, B o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void paramTypes() {
        System.out.println("Parameter type of A: " + ob1.getClass().getName());
        System.out.println("Parameter type of B: " + ob2.getClass().getName());
    }

    public A getOb1() {
        return ob1;
    }

    public void setOb1(A ob1) {
        this.ob1 = ob1;
    }

    public B getOb2() {
        return ob2;
    }

    public void setOb2(B ob2) {
        this.ob2 = ob2;
    }
}
