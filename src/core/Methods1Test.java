package core;

public class Methods1Test {


    public static void main(String[] args) {


        Methods1 ob1 = new Methods1();

       /* ob1.addition(5,7);
        ob1.courseName = "Java";
        ob1.courseFee = 1250;
        ob1.display();

        */

       Methods1 ob2 = new Methods1();
       //ob2.display("Binoy", "API", 1250);

        System.out.println(Methods1.batch_name);
        Methods1.staticMethod();
        ob2.nonStaticMethod();

    }

}
