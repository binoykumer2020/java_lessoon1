package example1;

public class AlphaBatch extends CoreQA {

    static String batchName = " Alpha"; // static keyword
    static final  double courseFee; // a static final var

    static {
        courseFee = 1250; // you need to use static block
    }


    AlphaBatch(String name, String level, int age, int mobileNumber)
    {
        super(name, level, age, mobileNumber);
    }

    void displayInformation ( ){ // methods
        displayStar();
        System.out.println( " Batch name :"+ batchName);
        System.out.println(" Course fee : " +courseFee);
        super.displayInformation(); // super keyword
        System.out.println(" Student age : "+ getAge());
        System.out.println( " Student mobile no : "+ mobileNumber);
    }
}
