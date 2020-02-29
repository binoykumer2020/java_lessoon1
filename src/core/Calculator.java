package core;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        CalculatorCalculation ob1 = new CalculatorCalculation();


        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1 : " +ob1.num1);
        double num1 = input.nextDouble();

        System.out.println(" Enter num2 : " +ob1.num2);
        double num2 = input.nextDouble();

        System.out.println(" Enter num3 : " +ob1.num3);
        double num3 = input.nextDouble();

        ob1.addition();

    }
}
