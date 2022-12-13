package org.example;

import java.io.*;

public class ReadFile {
    public static String readFile(File file) {
        String rezult = "Failed to extract information from file";
        if(file ==null) {
            return rezult;
        }
        StringBuilder stringBuilder= new StringBuilder();
        String line=null;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            if(reader.ready()) {
                while ((line=reader.readLine())!=null) {
                        stringBuilder.append(line);
                }
                rezult=stringBuilder.toString();
            }
            else {
                return rezult;
            }
        } catch (IOException e) {
            e.getMessage();
            return rezult;
        }
        return rezult;
    }
}
