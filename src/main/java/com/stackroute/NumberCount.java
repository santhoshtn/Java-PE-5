package com.stackroute;
//     Write a program to find the number of counts in the following  String .
//     Store the output inMap< String ,Integer> as key value pair.
//     Input :   String  str = “one one -one___two,,three,one @three*one?two”;
//     Output : {"one":5 , "two":2, "three" :2}
import java.util.*;
//Class NumberCount
public class NumberCount {
    //method countMap takes an string input and returns a map
    public static Map<String,Integer> countMap(String input){
        Map<String,Integer> returnMap =new HashMap<>();
        if(input==null){
            return null;
        }
        else {
            String[] split = input.replaceAll("\\W", " ").
                    replaceAll("\\_+", " ").split("\\s+");
            List<String> storage = new ArrayList<String>();
            for (String item : split) {
                if (!storage.contains(item)) {
                    storage.add(item);
                    returnMap.put(item, 1);
                } else {
                    returnMap.put(item, returnMap.get(item) + 1);
                }
            }
            return returnMap;
        }
    }

}
