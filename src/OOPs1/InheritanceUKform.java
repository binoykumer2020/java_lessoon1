package OOPs1;

public class InheritanceUKform extends  InheritanceFormTemplate {


    int mobileNumber;

    static String country = "United Kingdom";  // its a good example of static variable

    void displayUKformInformation ( ){
        displayTemplateInformation();
        System.out.println(" Mobile number is : "+ mobileNumber);
        System.out.println( country);

    }
}
