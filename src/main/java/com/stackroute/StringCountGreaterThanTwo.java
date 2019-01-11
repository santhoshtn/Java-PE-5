package com.stackroute;
//      Write a program where an array of strings is input and output is a Map< String ,boolean>
//      where each different  string  is a key and its value is true if
//      that  string  appears 2 or more times in the arrayInput :
//      String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//      Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
import java.util.*;
//Class StringCountGreaterThanTwo
public class StringCountGreaterThanTwo {
    //method count takes string array as input and returns an map
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

}


