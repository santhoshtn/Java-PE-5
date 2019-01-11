package com.stackroute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class updateArray {
    public static List<String> replace(List<String> str, String input, String replace) {
        Iterator<String> it = str.listIterator();
        while (it.hasNext()) {
            if (it.next().matches(input)) {
                ((ListIterator<String>) it).set(replace);
            }
        }
        return str;
    }
    public static<E> List<E> empty(List<E> str){
        str.clear();
    return str;
    }
    public static void main(String[] args) {
        List<String> str=new ArrayList<String>();
        str.add("mango");
        str.add("apple");
        List<String>value=replace(str,"apple","kiwi");
        for (String item:value) {
            System.out.println(item);
        }
        List<String> empty=empty(str);
        for (String item:empty) {
            System.out.println(item);
        }
    }
}