package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(Integer key : functionMap.keySet()){
            if (requiredValue == functionMap.get(key)){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> result = new HashMap<>();
        for (Integer integer : sourceList) {
            result.put(integer, 5*integer+2);
        }
        return result;
    }
}
