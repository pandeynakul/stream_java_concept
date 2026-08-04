package com.java8.emp;

/* author :  Ankul Deshpande */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrpByAgeJPM {

    public static void main(String[] args) {

        //creates an hashmap
        //grp by age
        //age as key and key as value:
        HashMap<String, Integer> map = new HashMap();
        map.put("jahn elia", 34);
        map.put("Ankul Deshpande", 23);
        map.put("sanjay singhannia", 32);
        map.put("sawrqtw asshay", 34);
        map.put("rafhv chadd", 24);
        map.put("amrute pranv", 23);
        //23:[ankul des amru pranav} like this
        //jp morgan

        Map<Integer, List<String>> mapList = map.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(mapList);

        //iterate the mapList :

        mapList.forEach((key, values) -> {
            System.out.println(key);
            values.forEach((value) -> System.out.println(value));
        });


    }
}
