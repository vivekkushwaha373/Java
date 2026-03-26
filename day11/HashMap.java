package day11;

import java.util.Map;
/*

*/




// Not synchronized

public class HashMap {
    public static void main(String[] args) {
        //duplicates keys not allowed
        //order not available
        Map<String,Integer> map=new java.util.HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("four",40); // it is replacement
        map.put(null,4);  //allowed
        map.put(null,5);  //allowed
        //null allowed at once only because duplicate keys not allowed 
        // value can be null as well
        // map.remove("key");
        // o(1)time complexity both for get and put


        System.out.println(map.get("four"));
        if(map.containsKey("four"))
        {
            System.out.println(map.get("four"));
        }


        for (String data: map.keySet())
        {
            System.out.println("key: "+data+"<----> value : "+map.get(data));

        }

        //2
        for(Integer value:map.values())
        {
            System.out.println("Value : "+value);
        }

        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println("key : "+entry.getKey() + " Value : "+entry.getValue());
        }

        //java 8
        map.forEach((key,value)->{
            System.out.println("key : "+key);
            System.out.println("value : "+value);
        });

        // for(Map.Entry<Integer, String> entry : map.entrySet())
    }
}