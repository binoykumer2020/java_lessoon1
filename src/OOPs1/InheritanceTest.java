package OOPs1;
// is the process of re use ability of parent class properties such methods and variables
// Parent child relationship
// Code reusability
// methods overriding

public class InheritanceTest {
    public static void main(String[] args) {

        InheritanceUKform ukform1 = new InheritanceUKform();
        ukform1.firstName = "Binoy";
        ukform1.lastName  = "test";
        ukform1.mobileNumber = 12345678;
        ukform1.email = "binoy@gmail.com";
        ukform1.displayUKformInformation();

        InheritanceUSAform usaform1 = new InheritanceUSAform();
        usaform1.firstName = "Ishaan";
        usaform1.lastName  = "test";
        usaform1.setAge(23);
        usaform1.email = "ishaan@gmail.com";
        usaform1.addCode = "AV-10098";
        usaform1.displayUSAinformation();

    }




}
