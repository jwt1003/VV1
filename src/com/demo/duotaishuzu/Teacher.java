package com.demo.duotaishuzu;

public class Teacher extends Persion{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写say方法
    @Override
    public String say(){
        return super.say() + "\t" + "salary=" + salary;
    }

    public void teach() {
        System.out.println("老师" + getName() + "在教书");
    }
}
