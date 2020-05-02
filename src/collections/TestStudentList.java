package collections;

import java.util.LinkedList;

public class TestStudentList {

    public static void main(String[] args) {

        LinkedList <StudentList> list = new LinkedList<StudentList>();

        StudentList ob1 = new StudentList(1001, "Binoy", "Java");
        StudentList ob2 = new StudentList(1002, "Tejas", "Advanced Java");
        StudentList ob3 = new StudentList(1003, "Rakhi", "Testing");
        StudentList ob4 = new StudentList(1004, "Pranav", "Selenium");
        StudentList ob5 = new StudentList(1005, "Samir", "API");
        StudentList ob6 = new StudentList(1006, "MD", "JSON");

        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        list.add(ob5);
        list.add(ob6);

        for (StudentList student : list) {
            System.out.println(student.id +  " " + student.names + " " +student.courseName);
        }
    }
}
