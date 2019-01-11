package com.stackroute;
//        Create a Student class that represents the following information of a
//        student: id, name, and age all the member variables should be private .
//        a.Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `MainTest` create Student class object(minimum 5).
//        d.Add these student object into a List of type Student .
//        e.Sort the list based on their age in decreasing order, for student having sameAge, sort based on their name.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//class main test
public class MainTest {
    //method main test
    public static void mainTest() {
        List<Student> listStudentObject = new ArrayList<>();

        listStudentObject.add(new Student(1,"Sam",30));
        listStudentObject.add(new Student(2,"Tom",30));
        listStudentObject.add(new Student(3,"Charlie",24));
        listStudentObject.add(new Student(4,"Tim",22));
        listStudentObject.add(new Student(5,"Chloe",21));

        Collections.sort(listStudentObject, new StudentSorter());
    }
}
