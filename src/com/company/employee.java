package com.company;

abstract class employee {
    double salary;
    double workHours; //Количество рабочих часов
    String name;

    public employee(double salary, double workHours, String name) {
        this.salary = salary;
        this.workHours = workHours;
        this.name = name;
    }

    public void doWork(){
        System.out.println(name + "working for " + workHours + "hours with salary" + salary );
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
