package com.devday.business;

import java.util.Random;

public class Logic {

    public int generateValue(boolean positive) {
        if (positive) {
            return new Random().nextInt(100);
        } else {
            return new Random().nextInt(100) - 100;
        }
    }

}
