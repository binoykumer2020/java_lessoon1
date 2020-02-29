package core;

public class ReturningValueFromMethod {
    int square (int value){
        return value*value;
    }

    int triangle (int base, int height){
        return (int) (0.5*base*height);
    }

    double circle (double radius){
        return (22/7 * radius * radius);
    }

    public static void main(String[] args) {
        ReturningValueFromMethod ob1 = new ReturningValueFromMethod ();
        int result  = ob1.square(6);
        System.out.println(result);
        System.out.println(ob1.triangle(78,6));
        System.out.println(ob1.circle(2.1));
    }

}
