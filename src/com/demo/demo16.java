package com.demo;

public class demo16 {
    public static void main(String[] args) {
        Person p1 = new Person("xiaoggg",190,666);
        p1.out();
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //无参构造器
    public Person() {
    }
    //带三个属性的构造器
    public Person(String name, int age, double salary) {    //通过构造器下面的限制方法会失效
//        this.name = name;
//        this.age = age;
//        this.salary = salary;

        //通过在构造器里写set下面的方法就不会失效
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字不合法，请重新输入!");
            this.name = "打钩";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄不合法，请重新设置!");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void out() {
        System.out.println(name + "\n" + age + "\n" + salary);
    }
}

