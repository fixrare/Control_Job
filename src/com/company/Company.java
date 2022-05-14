    package com.company;

    import java.util.ArrayList;
    import java.util.Objects;

    public class Company {
        ArrayList<workGroup> workGroups = new ArrayList<workGroup>();

        public void addEmployee(employee e, String groupName) {
            boolean added = false;
            for (workGroup i : workGroups) {
                if (Objects.equals(i.workGroupName, groupName)) {
                    i.addEmployee(e);
                    added = true;
                }
            }
            if (!added) {
                workGroup wg = new workGroup();
                wg.addEmployee(e);
                wg.workGroupName = groupName;
                workGroups.add(wg);
            }
        }

        public boolean removeEmployee(String name, String groupName) {
            for (workGroup i : workGroups) {
                if (Objects.equals(i.workGroupName, groupName)) {
                    return i.removeEmployee(name);
                }
            }
            return false;
        }

        public void doWork(){
            for (workGroup i: workGroups) {
                i.doWork();
            }
        }


    }
