package basicInterface;

public class TestBankofEngland {

    public static void main(String[] args) {

        BankOfEngland bank; // object of a super class

        bank = new BarclaysBank();
        System.out.println(" Barclays interest arte : " + bank.rateofInterestRate() + "%");

        bank= new SantanderBank();
        System.out.println(" Santander interest arte : " + bank.rateofInterestRate() + "%");

        bank = new NatwestBank();
        System.out.println(" Natwest interest arte : " + bank.rateofInterestRate() + "%");

    }
}
