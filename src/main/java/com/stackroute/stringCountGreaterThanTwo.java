package com.stackroute;

import java.util.*;

public class stringCountGreaterThanTwo {
    public static Map<String,Boolean> count(String[] inputString){
        Map<String,Boolean> returnMap =new HashMap<>();
        List<String> storage=new ArrayList<String>();
        for (String item:inputString) {
            if(storage.contains(item)){
                returnMap.put(item,true);
            }
            else{
                storage.add(item);
                returnMap.put(item,false);
            }
        }
    return returnMap;
}
    public static void main(String[] args){
        String[] input={"a","b","c","d","e","f","a","b","c","c","a"};
        Map<String,Boolean> map=count(input);
        System.out.println(Arrays.asList(map));
    }
}


