package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        System.out.println("1-DoWork");
        System.out.println("2-add employee");
        System.out.println("3-remove employee");
        System.out.println("4-exit");

        Scanner scanner = new Scanner(System.in);

        int inp = scanner.nextInt();

        while (inp != 4) {
            switch (inp) {
                case 1 -> company.doWork();
                case 2 -> {
                    System.out.println("1-Worker");
                    System.out.println("2-Administrator");
                    System.out.println("3-Director");
                    inp = scanner.nextInt();
                    String name;
                    double wh;
                    String ws;
                    double sal;
                    String wg;
                    int cab;
                    float weight;
                    switch (inp) {
                        case 1 -> {
                            System.out.print("Name:");
                            name = scanner.next();
                            System.out.print("Work hours:");
                            wh = scanner.nextDouble();
                            System.out.print("Workspace:");
                            ws = scanner.next();
                            System.out.print("Salary:");
                            sal = scanner.nextDouble();
                            System.out.print("WorkGroup:");
                            wg = scanner.next();
                            company.addEmployee(new worker(sal, wh, name, ws), wg);
                        }
                        case 2 -> {
                            System.out.print("Name:");
                            name = scanner.next();
                            System.out.print("Work hours:");
                            wh = scanner.nextDouble();
                            System.out.print("Cabinet:");
                            cab = scanner.nextInt();
                            System.out.print("Salary:");
                            sal = scanner.nextDouble();
                            System.out.print("WorkGroup:");
                            wg = scanner.next();
                            company.addEmployee(new administrator(sal, wh, name, cab), wg);
                        }
                        case 3 -> {
                            System.out.print("Name:");
                            name = scanner.next();
                            System.out.print("Work hours:");
                            wh = scanner.nextDouble();
                            System.out.print("Cabinet:");
                            cab = scanner.nextInt();
                            System.out.print("Weight:");
                            weight = scanner.nextFloat();
                            System.out.print("Salary:");
                            sal = scanner.nextDouble();
                            System.out.print("WorkGroup:");
                            wg = scanner.next();
                            company.addEmployee(new director(sal, wh, name, cab, weight), wg);
                        }
                        default -> {
                            System.out.println("Wrong input");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Name:");
                    String name = scanner.next();
                    System.out.println("WorkGroup");
                    String wg = scanner.next();
                    company.removeEmployee(name,wg);
                }
                default -> {
                    System.out.println("Wrong input");
                }
            }
            inp = scanner.nextInt();
        }


    }
}
