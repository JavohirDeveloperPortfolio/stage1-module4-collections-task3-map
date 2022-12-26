package com.epam.mjc.collections.map;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> result = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        String[] list = sentence.split(" ");
        for (String s : list) {
            String temp = s.toLowerCase();
            if (temp.contains(".")){
                temp = temp.substring(0,temp.length() - 1);
            }
            if (temp.contains(",")){
                temp = temp.substring(0,temp.length() - 1);
            }

            if (result.containsKey(temp) && result.get(s) != null){
                result.put(temp, result.get(s) + 1);
            }else if(!(temp.equals("") || temp.equals(" "))){
                result.put(temp,1);
            }

        }
        return result;
    }
}
