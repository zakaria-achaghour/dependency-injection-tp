package com.zakaria;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class CU implements VGA, USB{

    @Qualifier("VGAS")
    private VGA vga;
    @Qualifier("USBM")
    private USB usb;

    public CU(VGA vga, USB usb) {
        this.usb = usb;
        this.vga = vga;
    }
    @Override
    public int read() {
        return usb.read();
    }

    @Override
    public void print(String message) {
        vga.print(message);
    }
}
