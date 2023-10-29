package com.epam.mjc.io;

import java.io.IOException;

public class StudentFileNotFoundException extends IOException {

    StudentFileNotFoundException(String msg){
        super(msg);
    }
}
