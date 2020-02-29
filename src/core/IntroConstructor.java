package core;

// Constructor, parameterised/default
// constructor overloading

public class IntroConstructor {

    public static class StudentDetails {

        String name;
        int id;
        String module;
        String gender;

        StudentDetails(String n, int i, String m){
            name = n;
            id = i;
            module = m;

        }
        StudentDetails ( ){
            System.out.println("I am a default constructor");
        }

        StudentDetails ( String g, String n){
            name = n;
            gender = g;
        }


        void displayInformation ( ){
            System.out.println(" Student Name : " + name);
            System.out.println(" Student ID : " + id);
            System.out.println(" Module taken : " + module);
            System.out.println(" Student gender : "+ gender);
            System.out.println();

        }

    }
}
