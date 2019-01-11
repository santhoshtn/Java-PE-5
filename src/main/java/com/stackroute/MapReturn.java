package com.stackroute;
//        Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//        Modify and return the given map as follows:a. If the key `val1` has a value,
//        set the key `val2` to have that value, and b.
//        Set the key `val1` to have the value `"  "` (empty string ).
//        Example 1:The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}
//        Example 2:The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2":"mars"}
//

import java.util.Iterator;
import java.util.Map;

//class MapReturn
public class MapReturn {

    //method map performs the specified logic in the problem statement
    public static Map<String,String> map(Map<String,String> originalMap){
        Iterator<Map.Entry<String,String> > iterator=originalMap.entrySet().iterator();
        String eachKeyInMap="";
        String value="";
        int flag=0;
        if( !iterator.hasNext() )
        {
            return null;
        }

        while( iterator.hasNext() )
        {
            Map.Entry<String,String> myEntry=iterator.next();
            eachKeyInMap=(String) myEntry.getKey();
            if( eachKeyInMap != null && flag == 0)
            {
                value = (String) myEntry.getValue();
                originalMap.put(eachKeyInMap," ");
                flag=1;
            }

            else if( eachKeyInMap != null  && flag ==1 )
            {
                originalMap.put(eachKeyInMap,value);
            }
        }
        return originalMap;

    }
}
