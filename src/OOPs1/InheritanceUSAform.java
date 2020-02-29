package OOPs1;

public class InheritanceUSAform extends InheritanceFormTemplate {

    String addCode;
    static  String country = "USA";

    void displayUSAinformation ( ){
        displayTemplateInformation();
        System.out.println(" Age is : " + getAge());
        System.out.println(" Add a code : "+ addCode);
        System.out.println(country);

    }
}
