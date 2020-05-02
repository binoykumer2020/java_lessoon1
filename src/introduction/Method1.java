package introduction;



public class Method1 {


    String name  ;
    String email ;  // class/ static var
   private int age; // encapsulation

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // constructor

//    Method1 (String name, String email) {
//        this.name = name;
//        this.email = email;
//    }

    void add (int a , int b){  // local/ instance var
        int result = a+b;
        System.out.println(result);
    }

    void add(int a, int b, int c ){
        System.out.println(a+b+c);

    }

    void display (){
        System.out.println("The person name: "+name);
        System.out.println("The person email: "+email);

    }

    public static void main(String[] args) {

        Method1 ob1 = new Method1();
        ob1.add(1,2,3);
    }

}
