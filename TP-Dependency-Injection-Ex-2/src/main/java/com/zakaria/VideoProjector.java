package com.zakaria;

import org.springframework.stereotype.Component;


public class VideoProjector implements VGA{
    @Override
    public void print(String message) {
        System.out.println("Video projector ..");
    }
}
