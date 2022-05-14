package com.company;

import java.util.ArrayList;

public class workGroup {
    String workGroupName;
    ArrayList<employee> employees = new ArrayList<employee>();

    public void addEmployee(employee e) {
        employees.add(e);
    }

    public boolean removeEmployee(String name) {
        if (!employees.removeIf(i -> i.name.equals(name))) {
            return false;
        }else return true;
    }

    public void doWork(){
        System.out.println("Workgroup:"+workGroupName);
        for (employee i : employees) {
            i.doWork();
        }
    }
}
