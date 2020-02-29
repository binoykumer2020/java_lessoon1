package OOPs2;
// 2 types of Polymorphism
// Compile time/ Static polymorphism--> method/constructor overloading
// Run time/ Dynamic polymorphism  --> method overriding
/*is a mechanism where a parent class reference variable
can take many forms and refer to different objects i.e sub class

*/
public class PolyAddCompile {

    void addition (int a, int b){
       int  result = a+b;
        System.out.println(result);
    }

    void addition (int a, double b){
        double result  = a+b;
        System.out.println(result);
    }

    void addition (){
        System.out.println("Nothing to show");
    }

    void addition (double a, double b){
        double result  = a+b;
        System.out.println(result);
    }

}
