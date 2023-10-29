package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {


    public Profile getDataFromFile(File file) {

        String name;
        int age;
        String email;
        long phone;

        try (java.io.FileReader fileReader = new java.io.FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            name = bufferedReader.readLine().split(": ")[1];
            age = Integer.parseInt(bufferedReader.readLine().split(": ")[1]);
            email = bufferedReader.readLine().split(": ")[1];
            phone = Long.parseLong(bufferedReader.readLine().split(": ")[1]);

        } catch (IOException e) {
            try {
                throw new StudentFileNotFoundException("Student was not found");
            } catch (StudentFileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }

        return new Profile(name, age, email, phone);
    }
}

