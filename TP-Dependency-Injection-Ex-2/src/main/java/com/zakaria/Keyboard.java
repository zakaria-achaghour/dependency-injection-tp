package com.zakaria;

import org.springframework.stereotype.Component;


public class Keyboard implements USB{
    @Override
    public int read() {
        System.out.println("Keyboard ...");
        return 1;
    }
}
