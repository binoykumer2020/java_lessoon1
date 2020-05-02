package example1;

// create a super class called CoreQA with some instance variable (common features)
// Get some constructors using this Keyword to instantiate --> local and instance variable
// Get some methods where displaying the info
// Super keyword using
// Encapsulation and Inheritance concepts should be used as well
// run the program from a test class with main method
// final keyword
// super keyword



public class CoreQA {

    final  String training = " CoreQA training"; // final keyword with instance var


    String name;
    String level;

    int mobileNumber;
    private int age; // encapsulation

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    final void displayStar (){
        System.out.println("*********************");// this is an example of final method which can be inherited but not override
    }

    CoreQA ( String name, String level, int age){
         // parameterised constructor with this keyword
        this.name = name;
        this.level = level;
        this.age = age;
    }

    CoreQA (String name, String level, int age, int mobileNumber ){
        this(name, level, age); // this method
        this.mobileNumber = mobileNumber;
    }

    void displayInformation ( ){ // methods
        System.out.println(" Company name : "+training);
        System.out.println(" Student name : " + name);
        System.out.println(" Level of experience : " + level);


    }


}
