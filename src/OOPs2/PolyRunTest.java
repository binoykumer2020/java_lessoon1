package OOPs2;

public class PolyRunTest {

    public static void main(String[] args) {

       //PolyRunGeomatry shape1  = new  PolyRunGeomatry();


       PolyRunTriangle triangle = new PolyRunTriangle(10,5);
       PolyRunSquare square = new PolyRunSquare(10);
       PolyRunRectangle rectangle = new PolyRunRectangle(12,5);
       PolyRunCircle circle = new PolyRunCircle(4);

        System.out.println(triangle.area());
        System.out.println(square.area());
        System.out.println(rectangle.area());
        System.out.println(circle.area());



       /* dynamic polymorphism reference of the super class used to refer to sub classes
       PolyRunGeomatry shape2 = new PolyRunCircle(5);
        PolyRunGeomatry shape3 = new PolyRunRectangle(12,6);
        PolyRunGeomatry shape4 = new PolyRunSquare(4);
        PolyRunGeomatry shape5 = new PolyRunTriangle(12, 7);

        System.out.println( shape2.area());
        System.out.println(shape3.area());
        System.out.println(shape4.area());
        System.out.println(shape5.area());

        */
        // what if there are 100s of object: Array comes to the picture

       /* PolyRunGeomatry [] s = new PolyRunGeomatry[4];

         s [0] = new PolyRunCircle(5);
         s [1] = new PolyRunRectangle(12,6);
         s [2] = new PolyRunSquare(4);
         s [3] = new PolyRunTriangle(12, 7);

        for (int i = 0; i <4 ; i++) { System.out.println(s[i].area());}
      //  System.out.println(s[0].area());
       // System.out.println(s[1].area());
       // System.out.println(s[2].area());
       // System.out.println(s[3].area());

        */

    }


}
