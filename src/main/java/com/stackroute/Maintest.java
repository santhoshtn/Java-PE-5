package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maintest {
    public static void main(String[] args) {
        List<Student> listStudentObject = new ArrayList<>();

        listStudentObject.add(new Student(1,"Sam",30));
        listStudentObject.add(new Student(2,"Tom",30));
        listStudentObject.add(new Student(3,"Charlie",24));
        listStudentObject.add(new Student(4,"Tim",22));
        listStudentObject.add(new Student(5,"Chloe",21));
        Collections.sort(listStudentObject, new StudentSorter());
        for (Student student : listStudentObject) {
            System.out.println(student);
        }
    }
}
