package interfaceConcept;

public class Test  {
    public static void main(String[] args) {

        Bank bank;
        bank = new HSBC();
        System.out.println("HSBC interest rate : "+ bank.rateOfInterest() + "%");

        bank = new Barclays();
        System.out.println("Barclays interest rate : "+ bank.rateOfInterest() + "%");
    }
}
