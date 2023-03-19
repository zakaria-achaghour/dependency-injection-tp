package com.zakaria;

import org.springframework.stereotype.Component;

@Component("VGAS")
public class Screen implements VGA{
    @Override
    public void print(String message) {
        System.out.println("screen ..");
    }
}
