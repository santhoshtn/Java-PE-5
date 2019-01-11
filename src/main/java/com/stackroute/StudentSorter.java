package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
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
