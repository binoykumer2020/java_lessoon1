package introduction;

public class Lesson9Test {

    public static void main(String[] args) {
        Lesson9 teacher1 = new Lesson9();
        teacher1.name = "Binoy Kumer";
        teacher1.gender= "Male";
        teacher1.phone = 123456;

        Lesson9 teacher2 = new Lesson9();
        teacher2.name = "Ishaan Kumer";
        teacher2.gender= "Male";
        teacher2.phone = 1256;

        System.out.println("Name : " + teacher1.name);
        System.out.println("Gender : " + teacher1.gender);
        System.out.println("Phone No : " + teacher1.phone);

        System.out.println();

        System.out.println("Name : " + teacher2.name);
        System.out.println("Gender : " + teacher2.gender);
        System.out.println("Phone No : " + teacher2.phone);



    }
}
