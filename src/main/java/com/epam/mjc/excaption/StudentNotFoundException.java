package com.epam.mjc.excaption;

public class StudentNotFoundException  extends IllegalArgumentException {

    public StudentNotFoundException(String message) {
        super(message);
    }

}
