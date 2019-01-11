package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class UpdateArrayTest {
    private UpdateArray object;
    @Before
    public void setUp() throws Exception {
    object=new UpdateArray();
    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }
    @Test
    public void replaceCheckSuccess(){
        List<String> str=new ArrayList<String>();
        str.add("mango");
        str.add("apple");
        List<String> actual=object.replace(str,"apple","kiwi");
        List<String> expected=new ArrayList<String>();
        expected.add("mango");
        expected.add("kiwi");
        assertEquals(actual,expected);
    }
    @Test
    public void emptyCheckSuccess(){
        List<String> str=new ArrayList<String>();
        str.add("mango");
        str.add("apple");
        List<String> expected=new ArrayList<String>();
        assertEquals(expected,object.empty(str));
    }
    @Test
    public void nullCheck(){
        List<String> str=new ArrayList<String>();
        List<String> expected=new ArrayList<String>();
        assertEquals(expected,object.empty(str));
    }
}