package introduction;
/*Array is a collection of variables of a same data type.
datatype [] arrayName
int [] number; declare an array (primitive data type)
number = new int [10];
int [] number = new int [10] create an array declaration and create
*/

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

       /*
        int number [] = {12,23,34,45}; // One dimentional array

        System.out.println(number[0]);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            System.out.println("\n\n"); // 2 lines break
        }
        */


        // two dimentional array

        /*
        int num [][] = {{100,200,300,400,500},{111,222,333,444,555}};

        for (int i = 0; i <5 ; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                System.out.print(num[i][j]);
            }
            System.out.println(" ");

        }
        */

        /*
        int [] num = new int[5];
        String [] name = new String[3];
        // how to initialise /index
        num[0]= 100;
        num[1]= 200;
        num[2]= 300;
        num[3]= 400;
        num[4]= 500;

       // System.out.println(num[1]);
       // System.out.println(num[1]+num[2]);

        name [0]= "Binoy";
        name [1]= "Ishaan";
        name [2]= "Nandini";

        System.out.println(name[2]);

        // how to print array size
        int len = num.length;
        //System.out.println("Array size : "+ len);

        /*

        for (int i = 0; i <number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println("The sum of the numbers : "+ sum );
        double avg = sum/number.length;
        System.out.println("The average of the numbers : "+ avg);

        double max = number[0];
        double min = number[0];

        for (int i = 1; i < 5; i++) {
            if (max<number[i]){
                max = number[i];
            }
            if (min>number[i]) {
                min = number[i];

            }

        }
        System.out.println("The max number : "+ max);
        System.out.println("The min number : "+ min);


         */



    }


}
