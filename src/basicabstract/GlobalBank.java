package basicabstract;

public abstract class GlobalBank {

    abstract void cashWithdrawl ( );
    abstract void cashDeposits ( );

    void add (int a, int b ){
        int result = a+b;
        System.out.println("Sum of these two values :"  +result );
    }

}
