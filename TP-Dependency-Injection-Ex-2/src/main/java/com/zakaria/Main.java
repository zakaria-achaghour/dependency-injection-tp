package com.zakaria;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.zakaria");
        VGA vga = applicationContext.getBean(VGA.class);

        USB usb = applicationContext.getBean(USB.class);

        CU cu = new CU(vga, usb);
        cu.print("hi ..");
        System.out.println(cu.read());
    }
}