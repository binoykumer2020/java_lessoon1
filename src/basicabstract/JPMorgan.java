package basicabstract;

public class JPMorgan extends GlobalBank {

    @Override
    void cashWithdrawl() {
        System.out.println("This is cash withdrawl");
    }

    @Override
    void cashDeposits() {
        System.out.println("This is a cash deposits");
    }

}
