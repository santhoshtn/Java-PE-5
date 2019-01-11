package com.stackroute;
//          Write a program to implement set interface which sorts the given randomly ordered names in ascending order.
//        Convert the sorted set in to an  array
//        listInput : Harry  Olive  Alice  Bluto  Eugene
//        Output :Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
//        Array list  from Set :  Alice Bluto Eugene Harry Olive
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
//Class SortingSet
public class SortingSet {
    //method method for sorting hashSet and Returns List of type string
    public List<String> setSorting(HashSet originalSet)
    {
        if( originalSet == null)
        {
            return null;
        }
        TreeSet sortedSet= new TreeSet();
        sortedSet.addAll(originalSet);
        List<String> setList = new ArrayList<String>();
        setList.addAll(sortedSet);
        return setList;
    }
}
