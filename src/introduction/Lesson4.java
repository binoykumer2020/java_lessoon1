package introduction;

import java.util.Scanner;

//for each loop
public class Lesson4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] names = new String[4];
        System.out.println("Enter a name ");

        for (int i = 0; i <names.length ; i++) {
            names[i] = input.next();
        }

        System.out.println(names[0]  + " "  +  names [3]);


        String [] name = { "Binoy", "Kumer", "Das", "Gupta"};
        for (String x : name) {
            System.out.println(x);
        }


    }

}
