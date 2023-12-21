package com.demo.duotaishuzu;

public class Student extends Persion{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "\t" + "score=" + score;
    }

    public void study() {
        System.out.println("学生" + getName() + "在学习");
    }
}
