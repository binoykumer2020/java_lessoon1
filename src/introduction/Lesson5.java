package introduction;

// arrays sorting

import java.util.Arrays;

public class Lesson5 {

    public static void main(String[] args) {

        int[] sortNumber = {12,0,-8,-6,980};
        Arrays.sort(sortNumber);

        System.out.println("Ascending Order ");
        for (int i = 0; i <sortNumber.length ; i++) {
            System.out.println( " " + sortNumber[i]);

        }
        System.out.print("");

        System.out.println( " Descending Order ");
        for (int i = 4; i >=0 ; i--) {
            System.out.println( " " +sortNumber[i]);

        }

        String [] names = {"Binoy", "Ishaan", "Nandini", "Titli"};

        System.out.print(" ");
        System.out.println(" String sorting by ascending");

        for (int i = 0; i <names.length ; i++) {

           

        }
    }
}
