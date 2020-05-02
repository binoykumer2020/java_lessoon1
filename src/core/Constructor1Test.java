package core;

public class Constructor1Test {

    public static void main(String[] args) {

        Constructor1 ob1 = new Constructor1();

        ob1.shoppingCenterName = "John Lewis";
        //ob1.display();

        Constructor1 ob2 = new Constructor1("Marks and Spencer", 56.78);
      //  ob2.display();

        Constructor1 ob3 = new Constructor1("Asda", 5.89, "London");
       // ob3.display();
        System.out.println();

        Constructor1 ob4 = new Constructor1("Tesco", "Birmingham", 134.67);
        //ob4.display();
        //ob4.methodTest("Sainsburys", "Manchester");




    }
}
