package com.example.ping;

public class Cat extends Animal {
    public Cat(String  name) {
        super.name=name;
    }
      void cry(){  
         System.out.println("喵~喵~喵~");  
     }

    @Override
    String getAnimalName() {
        return "我的名字是"+name;

    }
}