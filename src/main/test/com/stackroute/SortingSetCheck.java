package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortingSetCheck {
    SortingSet object;
    @Before
    public void setUp() throws Exception {
        object=new SortingSet();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void sortTest (){
        List<String> setList = new ArrayList<String>();
        HashSet<String> actual=new HashSet<>();
        actual.add("Harry");
        actual.add("Alice");
        actual.add("Olive");
        setList.add("Alice");
        setList.add("Harry");
        setList.add("Olive");
        assertEquals(setList,object.setSorting(actual));
    }

}