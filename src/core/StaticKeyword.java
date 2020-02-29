package core;
// Static variable, static method, static block
//memory management
// stack memory heap memory
public class StaticKeyword {

    String name;
    int id;
    static String batch_name = "Alpha batch"; // static variable

    StaticKeyword ( String n, int i){
        name = n;
        id = i;
    }

    void displayInformation ( ){
        System.out.println(" Name of the student : "+ name);
        System.out.println(" Sudent ID :"+ id);
        System.out.println(batch_name);
    }

    void method1 ( ){
        System.out.println("I am a non static method");
    }

    static void method2 ( ){
        System.out.println("I am a staic method");
    }

    public static void main(String[] args) {

      //  StaticKeyword ob1 = new StaticKeyword ("Binoy", 10001);
      //  StaticKeyword ob2 = new StaticKeyword("Ishaan", 10002);

     //   ob1.displayInformation();
      //  ob2.displayInformation();

        // using static member we don't need to create object to use them
        // we can use static methods or variable by calling classname. operator
        //System.out.println(batch_name);

        StaticKeyword.method2();

        // static block always works before main method

        System.out.println("I am a main method");
    }

}
