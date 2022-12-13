package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFilefilу_IsNotExist_ReturnsErrorMessage() {
        File file = new File("sss");
        String expextedRezult = "Failed to extract information from file";
        assertEquals(expextedRezult,ReadFile.readFile(file));
    }
    @Test
    void readFilefilу_IsExist_ReturnsErrorMessage() {
        File file = new File("texts.txt");
        String expextedRezult = "actual lenguage";
        assertEquals(expextedRezult,ReadFile.readFile(file));
    }
    @Test
    void readFilefilу_IsNull_ReturnsErrorMessage() {
        File file = null;
        String expextedRezult = "Failed to extract information from file";
        assertEquals(expextedRezult,ReadFile.readFile(file));
    }

    @Test
            void te() {
        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");

        assertTrue(asiaCapital1.equals(asiaCapital2));
        assertFalse(asiaCapital1.equals(asiaCapital3));
    }
}