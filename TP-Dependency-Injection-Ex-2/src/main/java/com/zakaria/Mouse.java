package com.zakaria;

import org.springframework.stereotype.Component;

@Component("USBM")
public class Mouse implements USB{
    @Override
    public int read() {
        System.out.println("Mouse");
        return 0;
    }
}
