package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class numberCountTest {
    numberCount object;
    @Before
    public void setUp() throws Exception {
    object=new numberCount();
    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }
    @Test
    public void countMapTestSuccess(){
        Map<String,Integer> map =new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        assertEquals(map,object.countMap("one one -one___two,,three,one @three*one?two"));
    }
    @Test
    public void nullCheck(){
        Map<String,Integer> expected =new HashMap<>();
        expected=null;
        assertEquals(expected,object.countMap(null));
    }
}