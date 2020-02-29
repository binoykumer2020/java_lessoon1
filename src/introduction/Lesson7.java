package introduction;

import java.util.ArrayList;

public class Lesson7 {

    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();

        num1.add(100);
        num1.add(200);
        num1.add(300);

        num2.add(1);
        num2.add(2);
        num2.add(3);

        num3.addAll(num2);

        System.out.println( " Array list 1 :"+num1);
        System.out.println( " Array list 2 :"+num2);
        System.out.println( " Array list 3 :"+num3);

        System.out.println(num1.contains(100));
        System.out.println(num1.equals(num2));
        System.out.println(num2.equals(num3));

    }
}
