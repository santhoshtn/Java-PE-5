package com.stackroute;
//        Write a Java program to update specific array element by given
//        element and empty the  array list .
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//        Array list  after removing all elements []

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//class update array
public class UpdateArray {
    //method replace takes three input i.e list,string,string and returns an list array of type string
    public static List<String> replace(List<String> str, String input, String replace) {
        if(str ==null)
        {
            return null;
        }
        Iterator<String> it = str.listIterator();
        while (it.hasNext()) {
            if (it.next().matches(input)) {
                ((ListIterator<String>) it).set(replace);
            }
        }
        return str;
    }
    //method empty returns the empty list for any passed string
    public static<E> List<E> empty(List<E> str){
        str.clear();
    return str;
    }

}