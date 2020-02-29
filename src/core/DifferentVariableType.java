package core;

public class DifferentVariableType {

    // there are three types of variable static/Class variable, instance variable and local variable

    // instance var

    String name ;
    String module;
    int value;

    static String batch_name = "Alpha 2019";

    static void square (int value){
        int result =  value*value;
        System.out.println(result);
        return;
    }

    public static void main(String[] args) {
        DifferentVariableType.square(5);
    }
}

// get some instance variable, create some constructor and instantiated them and create some methods and
// create a calcultaor calculation where user can provide inputs