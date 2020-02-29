package OOPs2;

public class AbstractAdvance extends AbstractBankAccountProperty {

    static String account_type = "ADVANCE";

    @Override
    void cashWithdrawal() {
        System.out.println(account_type);
        System.out.println("This is a Cash withdrawal method:");
    }

    @Override
    void cashDeposits() {
        System.out.println("This is a Cash deposits method:");
    }
}
