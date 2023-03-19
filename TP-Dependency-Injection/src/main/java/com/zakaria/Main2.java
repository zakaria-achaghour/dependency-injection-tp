package com.zakaria;

import com.zakaria.dao.IDao;
import com.zakaria.metier.IMetier;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        // dynamic instantiation using config file
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance(dao);

        // Method method = cMetier.getDeclaredMethod("setDao", IDao.class);
        // method.invoke(metier, dao); // Dependency Injection dynamic

        System.out.println(metier.calcul());
    }
}
