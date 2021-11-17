package test.m2_11_stack_queue.exercise.s2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountCharInString {
    public static void main(String[] args){
        String stTest= "Hello World";
        TreeMap<Character, Integer> treeMap= new TreeMap<>();
        Arrays.asList(stTest.toUpperCase().split("")).forEach(e->{
            int count=1;
            if(treeMap.containsKey(e.charAt(0))){
                count+= treeMap.get(e.charAt(0));
            }
//            if(!e.isBlank())
            treeMap.put(e.charAt(0),count);
        });

        for (Map.Entry<Character, Integer> s: treeMap.entrySet()
             ) {
            System.out.println(s);
        }
    }
}
