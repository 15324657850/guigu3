package com.example.ping;

public class Application {
  
    public static void main(String[] args) {  
        Simulator simulator=new Simulator();  
        simulator.playSound(new Dog("dog"));
        simulator.playSound(new Cat("cat"));
          
    }  
  
}