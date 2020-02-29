// Single line comment
/* Block comments
Create a package then classes
Data type primitive and non primitive
Up casting and down casting widening and narrowing

 */

package introduction;
//basic variable operations, user defined var, convert celcius to farenhite, find out the circle and triangle value
import java.util.Scanner;

public class Lesson1  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter num1 :");
        int num1 = input.nextInt();

        System.out.println("Enter num2 :");
        int num2 = input.nextInt();

        System.out.println("Enter your full name: ");
        String name = input.next();


        System.out.println("Welcome " + name + " to the testing world");
        System.out.println("Adding the values return :" +(num1+num2));
        System.out.println("Subtracting the values return :" +(num1-num2));



        // widening-> Upcasting byte->char->short->int->float->double

       /* int x = 9;
        double y = x;
        float z = x;

        System.out.println(y);
        System.out.println(z);

        */
        // Downcasting double->float->int : Change the variable type
       /* double i =  7.8989;
        int j =  (int )i;
        System.out.println(j);
        */




    }
}
