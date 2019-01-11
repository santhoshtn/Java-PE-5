package com.stackroute;
//        Create a Student class that represents the following information of a
//        student: id, name, and age all the member variables should be private .
//        a.Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `MainTest` create Student class object(minimum 5).
//        d.Add these student object into a List of type Student .
//        e.Sort the list based on their age in decreasing order, for student having sameAge, sort based on their name.
public class Student {
    private int id;
    private String name;
    private int age;
    public Student(int id,String name,int age){
        this.id=id;this.name=name;this.age=age;
    }
    public int getId(){return id;}
    public int getAge() {return age;}
    public String getName(){return name;}
    public String toString() {
        return "{Id=" + id + " , Name=" + name + ", Age=" + age + '}';
    }
}
