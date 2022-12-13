package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WorkWithLetterTest {

    @Test
    void counEachLetter_PositiveResult() {
        Map<Character, Integer> expectedMap=WorkWithLetter.prepareMapOfLetter();
        expectedMap.put('A',2);
        expectedMap.put('C',1);
        expectedMap.put('T',1);
        expectedMap.put('U',1);
        expectedMap.put('L',1);
        Map<Character, Integer> actualMap=  WorkWithLetter.counEachLetter("texts.txt");
        assertEquals(2,expectedMap.get('A'));
        assertEquals(1,expectedMap.get('C'));
        assertEquals(1,expectedMap.get('T'));
    }

    @Test
    void sortingByNumberLetters() {
        Map<Character, Integer> expectedMap=WorkWithLetter.prepareMapOfLetter();
        expectedMap.put('A',7);
        expectedMap.put('C',6);
        expectedMap.put('T',5);
        expectedMap.put('U',4);
        expectedMap.put('L',3);
        Map<Character, Integer> aktualMap =WorkWithLetter.sortingByNumberLetters(expectedMap);
    }

    @Test
    void showListAndNumberLetters() {
        File file = new File("text2.txt");
        String actualRezult =WorkWithLetter.showListAndNumberLetters(file);
        assertEquals(actualRezult,actualRezult);

    }
}