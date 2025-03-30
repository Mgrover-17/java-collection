package com.bridgelabz.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>();

        for (String key : map1.keySet()) {
            mergedMap.put(key, map1.get(key));
        }

        for (String key : map2.keySet()) {
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + map2.get(key));
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println(mergeMaps(map1, map2));
    }
}
