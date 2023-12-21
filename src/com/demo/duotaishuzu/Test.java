package com.demo.duotaishuzu;

public class Test {
    public static void main(String[] args) {
        Persion[] persion = new Persion[5];

        persion[0] = new Persion("z", 1);
        persion[1] = new Student("x", 2, 66);
        persion[2] = new Student("c", 3, 77);
        persion[3] = new Teacher("v", 4, 2500);
        persion[4] = new Teacher("b", 5, 25000);

        for (int i = 0; i < persion.length; i++) {
            System.out.println(persion[i].say());
            if (persion[i] instanceof Student) {
                Student student = (Student) persion[i];
                student.study();
            } else if (persion[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persion[i];
                teacher.teach();
            }
        }
    }
}
