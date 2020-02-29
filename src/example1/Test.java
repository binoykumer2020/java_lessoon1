package example1;

public class Test {

    public static void main(String[] args) {

        AlphaBatch alpha1 = new AlphaBatch
                ("Binoy", "Advanced",40, 12345678 );

        alpha1.displayInformation();

        BetaBatch beta1 = new BetaBatch
                ( "Tejas", "Advance", 40,987654321);

        beta1.displayInformation();

    }

}
