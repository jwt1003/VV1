package com.demo.jicheng;

public class test {
    public static void main(String[] args) {
        pupil p = new pupil();
        p.name = "银角";
        p.age = 6;
        p.setScore(66);
        p.out();
        p.ing();


        System.out.println("=================================");


        graduated g = new graduated();
        g.name = "金角";
        g.age = 18;
        g.setScore(88);
        g.out();
        g.ing();
    }
}
