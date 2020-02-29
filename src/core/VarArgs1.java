package core;

public class VarArgs1 {

    void addMethod (int x, int y){

        System.out.println(x+y);

        return;
    }

    void addition (int ... numbers){

        int sum = 0;
        for (int x : numbers ) {
            sum = sum + x;
        }
        System.out.println("Addition of these numbers : " + sum);

    }
}
