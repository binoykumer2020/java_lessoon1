package OOPs2;

public class PolyCompileTest {

    // while creating an object of the class,

    public static void main(String[] args) {

        PolyAddCompile ob1 = new PolyAddCompile();
        ob1.addition();
        ob1.addition(5, 7);
        ob1.addition(5.6, 8.9);

        PolySubCompile ob2 = new PolySubCompile();
        ob2.subtraction(67,89);
    }

}
