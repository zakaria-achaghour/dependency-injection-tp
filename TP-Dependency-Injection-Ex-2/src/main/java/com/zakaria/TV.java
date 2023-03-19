package com.zakaria;

import org.springframework.stereotype.Component;

@Component
public class TV implements HDMI{
    @Override
    public void print(byte[] data) {
        System.out.println("TV ..");
    }
}
