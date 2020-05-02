package OOPs2;

public class PolyCompileTest {

    // while creating an object of the class,

    public static void main(String[] args) {

        PolyCompile ob1 = new PolyCompile();


        ob1.addition();
        ob1.addition(5, 7);
        ob1.addition(5.6, 8.9);

        PolyCompile ob2 = new PolyCompile();
        ob2.subtraction(67,89);
    }

}
