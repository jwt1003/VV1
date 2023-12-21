package com.demo.jicheng;

public class student {
    public String name;
    public int age;
    private double score;


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void out() {
        System.out.println(name + "\n" + age + "\n" + score);
    }
}
