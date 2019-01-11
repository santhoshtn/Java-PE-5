package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;

//Test class for map return program
public class MapReturnTest {
    private MapReturn twoKeyValue;
    //setup method before each test method
    @Before
    public void setUp()
    {
        twoKeyValue=new MapReturn();
    }
    //teardown method after each test method call
    @After
    public void tearDown()
    {
        twoKeyValue=null;
    }
    //success test method for the map return program
    @Test
    public void testTwoKeyValueSuccess()
    {
        Map<String,String> map= new TreeMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map<String,String> actualMap= twoKeyValue.map(map);
        Map<String, String> expectedMap=new TreeMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","java");

        assertEquals(expectedMap,actualMap);

    }
    //Failure test method for the map return program
    @Test
    public void testTwoKeyValueFailure()
    {
        Map<String,String> map= new TreeMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map<String,String> actualMap= twoKeyValue.map(map);
        Map<String, String> expectedMap=new TreeMap<>();
        expectedMap.put("val1","c++");
        expectedMap.put("val2","java");

        assertNotEquals(expectedMap,actualMap);
    }
    //check for null case for return map program
    @Test
    public void testTwoKeyValueNeutral()
    {
        Map<String,String> map= new TreeMap<>();

        Map<String,String> actualMap= twoKeyValue.map(map);

        assertNull(actualMap);
    }

}