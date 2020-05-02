package example1;

public class Test {

    public static void main(String[] args) {

       // one instance
        AlphaBatch alpha1 = new AlphaBatch("Binoy", "Advanced",40, 12345678 );
        alpha1.displayInformation();


        // second instance
        AlphaBatch alpha2 = new AlphaBatch("Mamun","Advanced", 35, 12345);
        alpha2.displayInformation();




        // 3rd insatnce
        BetaBatch beta1 = new BetaBatch
                ( "Tejas", "Advance", 47,987654321);
        beta1.displayInformation();

    }

}
