package OOPs2;

import java.util.Scanner;

public class AbstractBasic extends AbstractBankAccountProperty {

    static String account_type = "BASIC";


    @Override
    void cashWithdrawal() {
        System.out.println(account_type);
        System.out.println("This is a Cash withdrawl method:");
        Scanner input = new Scanner(System.in);


    }

    @Override
    void cashDeposits() {
        System.out.println(account_type);
        System.out.println("This is a Cash deposits methods:");

    }
}
