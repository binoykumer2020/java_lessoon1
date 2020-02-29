package introduction;

import java.util.Scanner;

// control statement if else then etc, find out positive/negative value, even/odd (val%2==0,even  ),
public class Lesson2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        double value = input.nextDouble();

        if (value>0){
            System.out.println("The value is positive");
        }
        else if (value <0){
            System.out.println("The value is negative");
        }
        else if (value == 0){
            System.out.println("The value is Zero");
        }
        else {
            System.out.println("Please enter an integer value");
        }
    }


}
