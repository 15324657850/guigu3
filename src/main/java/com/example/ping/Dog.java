package com.example.ping;

public class Dog extends Animal{
    public Dog(String  name) {
        super.name=name;
    }

    void cry(){
        System.out.println("汪~汪~汪~");  
          
    }

    @Override
    String getAnimalName() {
        return "我的名字是"+name;
    }

} 