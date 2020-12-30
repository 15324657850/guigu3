package com.example.demo;


import com.example.spring.CalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Mianshi3ApplicationTests {

    @Autowired
    CalService calService;

    @Test
   public void contextLoads() {
        int div = calService.div(4, 2);
        System.out.println(div);
    }

}
