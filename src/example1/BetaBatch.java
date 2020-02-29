package example1;

public class BetaBatch extends CoreQA {

    static String batchName = " Beta"; // static keyword
    final  double courseFee; // a blank final var, need to use constructor


    BetaBatch(String name, String level, int age, int mobileNumber) {
        super(name, level, age, mobileNumber);
        this.courseFee = 198250.00;
    }

    void displayInformation ( ){ // methods
        System.out.println();
        displayStar();
        System.out.println( " Batch name :"+ batchName);
        System.out.println(" Course fee : " +courseFee);
        super.displayInformation(); // super keyword
        System.out.println(" Student age : "+ getAge());
        System.out.println( " Student mobile no : "+ mobileNumber);

    }


}
