package com.example;

/**
 * @author wxl
 */
public class ComputerStudent extends Student {
    @Override
    public void expert() {
        System.out.println("我的特长是计算机");
    }

    @Override
    public String getStudentName() {
        return "计算机系 李四";
    }
}
