package com.company;

abstract class Person {
    public String name;
    public int birthYear;
    public double salary;

    Person(String name, int birthYear, double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public abstract void printInfo();
}

class Director extends Person {
    private String department;

    public Director(String name, int birthYear, double salary, String department) {
        super(name, birthYear, salary);
        this.department = department;
    }

    @Override
    public void printInfo() {
        System.out.println("Директор: " + name + ", год рождения: " + birthYear + ", зарплата: " + salary + ", отдел: " + department);
    }
}

class DepartmentHead extends Person {
    private String department;

    public DepartmentHead(String name, int birthYear, double salary, String department) {
        super(name, birthYear, salary);
        this.department = department;
    }

    @Override
    public void printInfo() {
        System.out.println("Начальник отдела: " + name + ", год рождения: " + birthYear +
                ", зарплата: " + salary + ", отдел: " + department);
    }
}

class Worker extends Person {
    private String position;

    public Worker(String name, int birthYear, double salary, String position) {
        super(name, birthYear, salary);
        this.position = position;
    }

    @Override
    public void printInfo() {
        System.out.println("Работник: " + name + ", год рождения: " + birthYear +
                ", зарплата: " + salary + ", должность: " + position);
    }
}

public class Laba10 {
    public static void main(String[] args) {
        Director director = new Director("Иванов Иван Иванович", 1975, 150000, "финансовый");
        DepartmentHead head1 = new DepartmentHead("Петров Петр Петрович", 1985, 80000, "отдел продаж");
        DepartmentHead head2 = new DepartmentHead("Сидоров Сидор Сидорович", 1980, 90000, "отдел производства");
        Worker worker1 = new Worker("Павлов Николай Валерьевич", 1990, 40000, "стажер");
        Worker worker2 = new Worker("Филлипов Роман Данилович", 1995, 50000, "бухгалтер");
        director.printInfo();
        head1.printInfo();
        head2.printInfo();
        worker1.printInfo();
        worker2.printInfo();
    }
}
