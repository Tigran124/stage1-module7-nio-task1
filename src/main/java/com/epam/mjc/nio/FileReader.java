package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (FileInputStream fin = new FileInputStream(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fin))) {
            return new Profile(reader);
        } catch (IOException e) {
            throw new CustomException();
        }
    }
}
