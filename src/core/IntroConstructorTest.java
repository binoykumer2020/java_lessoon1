package core;

public class IntroConstructorTest {

    public static void main(String[] args) {

        IntroConstructor.StudentDetails ob1 =
                new IntroConstructor.StudentDetails("Binoy", 1001, "Java");
        ob1.displayInformation();

        IntroConstructor.StudentDetails ob2 =
                new IntroConstructor.StudentDetails("Ishaan", 1002, "Kotlin");

        ob2.displayInformation();

        IntroConstructor.StudentDetails ob3 = new IntroConstructor.StudentDetails();
       // ob3.displayInformation();

        IntroConstructor.StudentDetails ob4 =
                new IntroConstructor.StudentDetails(" Nandini", "Female");
        ob4.displayInformation();


    }
}
