package com.zakaria.dao;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version DB");
        double v = 55;
        return v;
    }
}
