package com.stackroute;
//        Create a Student class that represents the following information of a
//        student: id, name, and age all the member variables should be private .
//        a.Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `MainTest` create Student class object(minimum 5).
//        d.Add these student object into a List of type Student .
//        e.Sort the list based on their age in decreasing order, for student having sameAge, sort based on their name.
import java.util.Comparator;
//class student sorter
public class StudentSorter implements Comparator<Student> {
    //method compare which overrides the comparator
    @Override
    public int compare(Student customer1, Student customer2) {

        // for comparison
        int NameCompare = customer1.getName().compareTo(customer2.getName());
        int AgeCompare = customer1.getAge()-customer2.getAge();

        // 2-level comparison using if-else block
        if (AgeCompare == 0) {
            return ((NameCompare== 0) ? AgeCompare : NameCompare);
        } else {
            return AgeCompare;
        }
    }
}
