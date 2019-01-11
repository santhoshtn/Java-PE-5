package com.stackroute;

import java.util.*;

public class numberCount {
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
    public static void main(String[] args){
        Map<String,Integer> map=countMap("one one -one___two,,three,one @three*one?two");
        System.out.println(Arrays.asList(map));
    }
}
