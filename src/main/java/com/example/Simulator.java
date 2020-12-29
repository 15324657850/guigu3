package com.example;

/**
 * @author wxl
 */
public class Simulator {
    public void playExpert(Student student) {
        System.out.println("学生姓名是" + student.getStudentName());
        student.expert();
    }
}
