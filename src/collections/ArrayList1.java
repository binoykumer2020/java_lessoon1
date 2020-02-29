package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Binoy");
        names.add("Ishaan");
        names.add("Tejas");
        names.add("Jaisal");
        names.add(4, "alpha");
        names.add(5,"Training CoreQA");

        //System.out.println(names);
        for (String n: names) {
           // System.out.println(" " + n);
        }
        //System.out.println(names.size());

        names.remove(0);
        //System.out.println(names);
        //System.out.println(names.size());
        boolean b = names.isEmpty();
        //System.out.println(b);
        //System.out.println(names.contains("Ishaan"));
        //System.out.println(names.indexOf("Ishaan"));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10000);
        numbers.add(20000);
        numbers.add(30000);
        numbers.add(40000);
        numbers.add(50000);

        ArrayList<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(100.00);
        doubleNumbers.add(200.00);
        doubleNumbers.add(300.00);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1000);
        num.add(2000);
        num.add (3000);



        // numbers.addAll(names);
        // numbers.add(doubleNumbers);
         boolean values = numbers.addAll(num);

        System.out.println(values);

        boolean toCheckEqualsOrNot= numbers.equals(num);
        System.out.println(toCheckEqualsOrNot);

        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println(num);

    }
}
