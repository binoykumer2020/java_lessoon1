package OOPs3;

public class BankTest {

    public static void main(String[] args) {

        Bank bank;
        bank = new Barclays();
        System.out.println("The interest rate of Barclays is : " +bank.getRateOfInterest() +"%");

        bank = new HSBC();
        System.out.println("The interest rate of HSBC is : " +bank.getRateOfInterest() + "%");
        bank.display();

        bank = new Santander();
        System.out.println("The interest rate of Santander is : " +bank.getRateOfInterest() + "%");
    }

}
