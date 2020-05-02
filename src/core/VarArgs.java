package core;

public class VarArgs {

    void addition ( int ...number){

        int sum = 0;

        for (int x: number) {
            sum = sum + x;
        }
        System.out.println("Addition of these numbers :"+sum);
    }

    void subtraction ( int ...number){
        int sum = 0;

        for (int x : number ) {
            sum = sum - x;
        }
        System.out.println("Subtraction of these number is " +sum);
    }

    public static void main(String[] args) {

        VarArgs ob = new VarArgs();
        ob.addition(12,56,8,9,0,4,3);
        ob.addition(1,2,3,4);

        ob.subtraction(12,10,6,-28);
    }
}
