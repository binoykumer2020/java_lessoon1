package introduction;

// array list adding and removing

import java.util.ArrayList;
import java.util.Collections;

public class Lesson6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println( "Size of the array list : "+ numbers.size());

        numbers.add(10000000);
        numbers.add(200);
        numbers.add(500);
        numbers.add(1000);
        numbers.add(4,50000);

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println(" Array list contains : "+ numbers);
        System.out.println(" Size of the array list : "+ numbers.size());

        numbers.remove(0);
        System.out.println(" Array list contains : "+ numbers);
        System.out.println(" Size of the array list : "+ numbers.size());

        // set a value
        numbers.set(0,100);
        numbers.set(2,300);
        System.out.println(numbers + " ");

        boolean b = numbers.isEmpty();
        System.out.println(b);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.indexOf(0));
        System.out.println(numbers.contains(300));

        // how to sorting

        Collections.sort(numbers);
        System.out.println( " After sorting out : "+ numbers);

        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(" Reverse sorting out : "+ numbers);



    }
}
