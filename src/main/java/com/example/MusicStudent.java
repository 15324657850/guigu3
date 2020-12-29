package com.example;

/**
 * @author wxl
 */
public class MusicStudent extends Student {
    @Override
    public void expert() {
        System.out.println("我的特长是音乐");
    }

    @Override
    public String getStudentName() {
        return "音乐系 张三";
    }
}
