package OOPs1;

public class InheritanceUKform extends  InheritanceFormTemplate {


    int mobileNumber;

    static String country = "United Kingdom";

    void displayUKformInformation ( ){
        displayTemplateInformation();
        System.out.println(" Mobile number is : "+ mobileNumber);
        System.out.println( country);

    }
}
