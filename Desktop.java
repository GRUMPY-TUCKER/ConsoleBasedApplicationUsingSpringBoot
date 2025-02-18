package com.rupam.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
