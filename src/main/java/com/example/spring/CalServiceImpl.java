package com.example.spring;

import org.springframework.stereotype.Service;

/**
 * @author wxl
 */
@Service
public class CalServiceImpl implements CalService {
    @Override
    public int div(int x, int y) {
        int result = x / y;
        System.out.println("-----------CalServiceImpl 值为 " + result);
        return result;

    }
}
