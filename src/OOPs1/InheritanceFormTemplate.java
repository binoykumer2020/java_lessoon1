package OOPs1;

public class InheritanceFormTemplate {

    String firstName;
    String lastName;
    String email;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displayTemplateInformation ( ){

        System.out.println(" First Name is : " +firstName);
        System.out.println(" Last name is : " + lastName);
       // System.out.println(" Full name is " + fullName);
        System.out.println(" Email : " +email);
    }
}
