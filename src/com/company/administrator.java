package com.company;

import java.util.ArrayList;

public class administrator extends employee{
    int cabinet;

    public administrator(double salary, double workHours, String name, int cabinet) {
        super(salary, workHours, name);
        this.cabinet = cabinet;
    }

    @Override
    public void doWork() {
        System.out.println(name + " working for " + workHours + " hours with salary " + salary + " in cabinet " + cabinet );
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

}
