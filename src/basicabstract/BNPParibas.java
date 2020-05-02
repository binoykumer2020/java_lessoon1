package basicabstract;

public class BNPParibas extends GlobalBank {
    @Override
    void cashWithdrawl() {
        System.out.println("cash");
    }

    @Override
    void cashDeposits() {
        System.out.println("deposits");
    }


}
