package com.yitian.service;

import com.yitian.model.Proper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class TestService {

    @Autowired
    private Proper proper;

    public void sayHello(String name) {
        System.out.println("Hello:"+name);
    }

    public void print() {
        System.out.println(proper.toString());
    }
}
