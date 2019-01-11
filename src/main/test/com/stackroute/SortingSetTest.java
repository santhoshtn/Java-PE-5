package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SortingSetTest {
    private SortingSet object;

    @Before
    public void setUp() throws Exception {
        object=new SortingSet();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void sortTestSuccess(){
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
    @Test
    public void sortTestFailure(){
        List<String> setList = new ArrayList<String>();
        HashSet<String> actual=new HashSet<>();
        actual.add("Harry");
        actual.add("Alice");
        actual.add("Olive");
        setList.add("Harry");
        setList.add("Alice");
        setList.add("Olive");
        assertNotEquals(setList,object.setSorting(actual));
    }
    @Test
    public void nullCheck(){
        List<String> setList = new ArrayList<String>();
        HashSet<String> actual=new HashSet<>();
        assertEquals(setList,object.setSorting(actual));
    }
}