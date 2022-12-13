package org.example;

import java.io.File;
import java.util.*;

public class WorkWithLetter {
    public static Map<Character, Integer> prepareMapOfLetter() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('Q', 0);
        map.put('W', 0);
        map.put('E', 0);
        map.put('R', 0);
        map.put('T', 0);
        map.put('Y', 0);
        map.put('U', 0);
        map.put('I', 0);
        map.put('O', 0);
        map.put('P', 0);
        map.put('S', 0);
        map.put('D', 0);
        map.put('F', 0);
        map.put('G', 0);
        map.put('H', 0);
        map.put('J', 0);
        map.put('K', 0);
        map.put('L', 0);
        map.put('Z', 0);
        map.put('X', 0);
        map.put('C', 0);
        map.put('V', 0);
        map.put('B', 0);
        map.put('N', 0);
        map.put('M', 0);
        return map;
    }

    public static Map<Character, Integer> counEachLetter(String text) {
        Map<Character, Integer> mapOfLetter = prepareMapOfLetter();
        String textUpperCase = text.toUpperCase();
        char[] arryChar = textUpperCase.toCharArray();
        for (int i = 0; i < arryChar.length; i++) {
            if (mapOfLetter.containsKey(arryChar[i])) {
                int count = mapOfLetter.get(arryChar[i]);
                mapOfLetter.replace(arryChar[i], count + 1);
            }
        }
        return mapOfLetter;
    }

    public static Map<Character, Integer> sortingByNumberLetters(Map<Character, Integer> mapOfLetter) {
        Collection<Integer> velues = mapOfLetter.values();
        Integer[] arryMembersSort = new Integer[velues.size()];
        int i = 0;
        for (Integer memer : velues) {
            arryMembersSort[i] = memer;
            i++;
        }
        Arrays.sort(arryMembersSort);
        Set<Character> keys = mapOfLetter.keySet();
        int countLetter = arryMembersSort.length;
        Map<Character, Integer> rezult = new LinkedHashMap<>();
        for (int j = countLetter - 1; j >= 0; j--) {
            for (Character key : keys) {
                if (arryMembersSort[j] == mapOfLetter.get(key)) {
                    rezult.put(key, arryMembersSort[j]);
                    break;
                }
            }
        }
        return rezult;
    }

    public static String showListAndNumberLetters(File file) {
        String text = ReadFile.readFile(file);
        if (text.equals("Failed to extract information from file")) {
            return "Failed to extract information from file";
        }
        Map<Character, Integer> mapOfLetter = counEachLetter(text);
        Map<Character, Integer> rezult = sortingByNumberLetters(mapOfLetter);
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> rezultKeys = rezult.keySet();
        for (Character k : rezultKeys) {
            stringBuilder.append(k + "->" + rezult.get(k) + "\n");
        }
        return stringBuilder.toString();
    }


}
