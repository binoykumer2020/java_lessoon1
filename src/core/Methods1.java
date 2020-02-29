package core;

public class Methods1 {

    static String batch_name = "alpha"; // static variable
    String courseName ;
    int courseFee;

    void display ( String name, String courseName, int courseFee){
        this.courseName = courseName;
        this.courseFee = courseFee;

        System.out.println("Student name " + name);
        System.out.println("Course name : " + courseName );
        System.out.println("Course fee : " + courseFee);
        System.out.println(batch_name);
    }

   int addition ( int a, int b){
        int i = a + b;
       System.out.println(i);
        return i;
    }

    static  void staticMethod (){
        System.out.println("I am a static method");
    }

    void nonStaticMethod ( ){
        System.out.println("I am a non static method");
    }
}
