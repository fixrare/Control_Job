package com.company;

import java.util.ArrayList;

public class director extends administrator{
    float weight;

    public director(double salary, double workHours, String name, int cabinet, float weight) {
        super(salary, workHours, name, cabinet);
        this.weight = weight;
    }

}
