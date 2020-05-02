package OOPs3;

public class BankTest {

    public static void main(String[] args) {

        Bank barclays = new Barclays();

        System.out.println("The interest rate of Barclays is : " +barclays.getRateOfInterest() +"%");
        barclays.display();
       // barclays.getRateOfInterest();

        Bank hsbc = new HSBC();
        System.out.println("The interest rate of HSBC is : " +hsbc.getRateOfInterest() + "%");
        hsbc.display();
//
//        bank = new Santander();
//        System.out.println("The interest rate of Santander is : " +bank.getRateOfInterest() + "%");
//
//        bank = new Natwest();
//        System.out.println("The interest rate of Natwest is : " +bank.getRateOfInterest() + "%");
    }

}
